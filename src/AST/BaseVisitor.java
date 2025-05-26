package AST;

import SymbolTable.*;
import gen.AngulerParser;
import gen.AngulerParserBaseVisitor;
import Classes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BaseVisitor extends AngulerParserBaseVisitor {
    Variable_symbolTable v_symbolTable;
    RepeatDefinitionComponent_SymbolTable r_symbolTable;
    RepeatStylesProperty_symbolTable rs_symboltable;
    public BaseVisitor(Variable_symbolTable v_symbolTable, RepeatDefinitionComponent_SymbolTable r_symbolTable, RepeatStylesProperty_symbolTable rs_symboltable) {
        this.v_symbolTable=v_symbolTable;
        this.r_symbolTable=r_symbolTable;
        this.rs_symboltable=rs_symboltable;
    }
    Stack<String>scopes=new Stack<>();
    @Override
    public AppNode visitApp(AngulerParser.AppContext ctx) {
        scopes.add("Global");
        List<ImportNode> imports = new ArrayList<>();
        for (AngulerParser.ImporTContext imp : ctx.imporT())
        {
            imports.add(visitImporT(imp));
        }
        ComponentNode component =visitComponent(ctx.component());
        AppComponentNode appComponent=visitAppComponent(ctx.appComponent());
        AppNode appNode = new AppNode(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        appNode.setImportNodeList(imports);
        appNode.setComponentNode(component);
        appNode.setAppComponentNode(appComponent);
        return appNode;
    }

    @Override
    public ImportNode visitImporT(AngulerParser.ImporTContext ctx) {
        ImportStatementNode importStatement=visitImportStatement(ctx.importStatement());
        ImportFromNode importFrom=visitImportFrom(ctx.importFrom());
        ImportNode importNode=new ImportNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        importNode.setImportedFromNode(importFrom);
        importNode.setImportStatementNode(importStatement);
        return importNode;
    }

    @Override
    public ImportStatementNode visitImportStatement(AngulerParser.ImportStatementContext ctx) {
        List<ImportedSymbolNode> importedSymbol = new ArrayList<>();
        for (AngulerParser.ImportedSymbolsContext imp : ctx.importedSymbols()) {
            importedSymbol.add(visitImportedSymbols(imp));
        }
        ImportStatementNode importStatement=new ImportStatementNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        importStatement.setImportedSymbolNode(importedSymbol);
        return importStatement;
    }

    @Override
    public ImportFromNode visitImportFrom(AngulerParser.ImportFromContext ctx) {
        ImportFromNode importFrom=new ImportFromNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        importFrom.setSTRING_LITERAL(ctx.STRING_LITERAL().getText());
        return importFrom;
    }

    @Override
    public ImportedSymbolNode visitImportedSymbols(AngulerParser.ImportedSymbolsContext ctx) {
        ImportedSymbolNode importedSymbol=new ImportedSymbolNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        importedSymbol.setMODULE_NAME(ctx.MODULE_NAME().toString());
        return importedSymbol;
    }

    @Override
    public ComponentNode visitComponent(AngulerParser.ComponentContext ctx) {
        scopes.add("Compnent");
        ComponentNode component=new ComponentNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        ComponentBodyNode componentBody=visitComponent_body(ctx.component_body());
        component.setComponentBodyNode(componentBody);
        scopes.pop();
        try{
            if(!r_symbolTable.TemplateIsExist())
                throw new MissingTemplateException("Component is missing a template. A component must have a 'template' property.");
        }catch (MissingTemplateException e){
            System.err.println("Semantic Error: "+e.getMessage());
        }
        return component;
    }

    @Override
    public ComponentBodyNode visitComponent_body(AngulerParser.Component_bodyContext ctx) {
        List<ComponentEntryNode> componentEntry=new ArrayList<>();
        for (var entry : ctx.component_entry()) {
            componentEntry.add((ComponentEntryNode) visit(entry));
        }
        ComponentBodyNode componentBody=new ComponentBodyNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        componentBody.setComponentEntryNodeList(componentEntry);
        return componentBody;
    }

    @Override
    public SelectorDataNode visitSelector_data(AngulerParser.Selector_dataContext ctx) {
        SelectorDataNode selectorData=new SelectorDataNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        selectorData.setSELECTOR_BODY(ctx.SELECTOR_BODY().getText());
        v_symbolTable.addVariable("selector","String",scopes.getLast(),selectorData.getSELECTOR_BODY(),selectorData.getLine(),selectorData.getColumn());
        try{
            if(!r_symbolTable.checkSelector())
                throw new ComponentPropertyRedefinitionException("Duplicate 'selector' found in @Component at line "+selectorData.getLine());
            r_symbolTable.addVariable("selector","String",scopes.getLast(),selectorData.getLine(),selectorData.getColumn());
        }catch (ComponentPropertyRedefinitionException e){
            System.err.println("Semantic Error: "+e.getMessage());
        }
        return selectorData;
    }

    @Override
    public StandaloneDataNode visitStandalone_data(AngulerParser.Standalone_dataContext ctx) {
        StandaloneDataNode standaloneData=new StandaloneDataNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        standaloneData.setSTANDALONE_VALUE(ctx.STANDALONE_VALUE().getText());
        v_symbolTable.addVariable("standalone","Boolean",scopes.getLast(),standaloneData.getSTANDALONE_VALUE(),standaloneData.getLine(),standaloneData.getColumn());
        try{
            if(!r_symbolTable.checkStandalone())
                throw new ComponentPropertyRedefinitionException("Duplicate 'standalone' found in @Component at line "+standaloneData.getLine());
            r_symbolTable.addVariable("standalone","Boolean",scopes.getLast(),standaloneData.getLine(),standaloneData.getColumn());
        }catch (ComponentPropertyRedefinitionException e){
            System.err.println("Semantic Error: "+e.getMessage());
        }
        return standaloneData;
    }

    @Override
    public ImportsDataNode visitImports_data(AngulerParser.Imports_dataContext ctx) {
        ImportsDataNode importsData=new ImportsDataNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        importsData.setSELECTOR_BODY(ctx.SELECTOR_BODY().getText());
        try{
            if(!v_symbolTable.ExistImport(importsData.getSELECTOR_BODY()))
                throw new UnknownReferenceImportException("'imports' must be an array of components, directives, pipes, or NgModules.\n" +
                        "  Value could not be determined statically.at line "+importsData.getLine());
            v_symbolTable.addVariable("imports","array",scopes.getLast(),importsData.getSELECTOR_BODY(),importsData.getLine(),importsData.getColumn());
        }catch (UnknownReferenceImportException e){
            System.err.println("Semantic Error: "+e.getMessage());
        }
        try{
            if(!r_symbolTable.checkImports())
                throw new ComponentPropertyRedefinitionException("Duplicate 'imports' found in @Component at line "+importsData.getLine());
            r_symbolTable.addVariable("imports","array",scopes.getLast(),importsData.getLine(),importsData.getColumn());
        }catch (ComponentPropertyRedefinitionException e){
            System.err.println("Semantic Error: "+e.getMessage());
        }
        return importsData;
    }

    @Override
    public TemplateNode visitTemplate_data(AngulerParser.Template_dataContext ctx) {
        return visitTemplate(ctx.template());
    }

    @Override
    public StylesNode visitStyles_data(AngulerParser.Styles_dataContext ctx) {
        return visitStyles(ctx.styles());
    }

    @Override
    public TemplateNode visitTemplate(AngulerParser.TemplateContext ctx) {
        TemplateNode template=new TemplateNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        try{
            if(!r_symbolTable.checkTemplate())
                throw new ComponentPropertyRedefinitionException("Duplicate 'template' found in @Component at line "+template.getLine());
            r_symbolTable.addVariable("template","String",scopes.getLast(),template.getLine(),template.getColumn());
        }catch (ComponentPropertyRedefinitionException e){
            System.err.println("Semantic Error: "+e.getMessage());
        }
        scopes.add("template");
        TemplateBodyNode templateBody=visitTemplate_body(ctx.template_body());
        template.setTemplateBodyNode(templateBody);
        scopes.pop();
        return template;
    }

    @Override
    public TemplateBodyNode visitTemplate_body(AngulerParser.Template_bodyContext ctx) {
        TemplateBodyNode templateBody=new TemplateBodyNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        List<DivBodyNode>divBody=new ArrayList<>();
        for (var divbody:ctx.div_body()){
            divBody.add((DivBodyNode) visit(divbody));
        }
        templateBody.setIN_DIV(ctx.IN_DIV().getText());
        templateBody.setDivBodyNodeList(divBody);
        return templateBody;
    }

    @Override
    public DivNode visitDiv_data(AngulerParser.Div_dataContext ctx) {
        return visitDiv(ctx.div());
    }

    @Override
    public DivBodyNode visitHtml_element_data(AngulerParser.Html_element_dataContext ctx) {
        return (DivBodyNode) visit(ctx.html_element());
    }

    @Override
    public HeaderNode visitHeader(AngulerParser.HeaderContext ctx) {
        HeaderNode header=new HeaderNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        header.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return header;
    }

    @Override
    public SectionNode visitSection(AngulerParser.SectionContext ctx) {
        SectionNode section=new SectionNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        section.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return section;
    }

    @Override
    public ArticleNode visitArticle(AngulerParser.ArticleContext ctx) {
        ArticleNode article=new ArticleNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        article.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return article;
    }

    @Override
    public AsideNode visitAside(AngulerParser.AsideContext ctx) {
        AsideNode aside=new AsideNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        aside.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return aside;
    }

    @Override
    public DetailsNode visitDetails(AngulerParser.DetailsContext ctx) {
        DetailsNode details=new DetailsNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        details.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return details;
    }

    @Override
    public ANode visitA(AngulerParser.AContext ctx) {
        ANode a=new ANode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        a.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return a;
    }

    @Override
    public OlNode visitOl(AngulerParser.OlContext ctx) {
        OlNode ol=new OlNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        ol.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return ol;
    }

    @Override
    public UlNode visitUl(AngulerParser.UlContext ctx) {
        UlNode ul=new UlNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        ul.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return ul;
    }

    @Override
    public LiNode visitLi(AngulerParser.LiContext ctx) {
        LiNode li=new LiNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        li.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return li;
    }

    @Override
    public NavNode visitNav(AngulerParser.NavContext ctx) {
        NavNode nav=new NavNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        nav.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return nav;
    }

    @Override
    public H1Node visitH1(AngulerParser.H1Context ctx) {
        H1Node h=new H1Node(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        h.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return h;
    }

    @Override
    public H2Node visitH2(AngulerParser.H2Context ctx) {
        H2Node h=new H2Node(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        h.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return h;
    }

    @Override
    public H3Node visitH3(AngulerParser.H3Context ctx) {
        H3Node h=new H3Node(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        h.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return h;
    }

    @Override
    public H4Node visitH4(AngulerParser.H4Context ctx) {
        H4Node h=new H4Node(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        h.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return h;
    }

    @Override
    public H5Node visitH5(AngulerParser.H5Context ctx) {
        H5Node h=new H5Node(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        h.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return h;
    }

    @Override
    public H6Node visitH6(AngulerParser.H6Context ctx) {
        H6Node h=new H6Node(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        h.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return h;
    }

    @Override
    public PNode visitP(AngulerParser.PContext ctx) {
        PNode p=new PNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        p.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return p;
    }

    @Override
    public ImgNode visitImg(AngulerParser.ImgContext ctx) {
        ImgNode img=new ImgNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        img.setIMG_Open(ctx.IMG_Open().getText());
        img.setIMG_Close(ctx.IMG_Close().getText());
        return img;
    }

    @Override
    public SpanNode visitSpan(AngulerParser.SpanContext ctx) {
        SpanNode span=new SpanNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        span.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return span;
    }

    @Override
    public StrongNode visitStrong(AngulerParser.StrongContext ctx) {
        StrongNode strong=new StrongNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        strong.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return strong;
    }

    @Override
    public INode visitI(AngulerParser.IContext ctx) {
        INode i=new INode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        i.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return i;
    }

    @Override
    public UNode visitU(AngulerParser.UContext ctx) {
        UNode i=new UNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        i.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return i;
    }

    @Override
    public BNode visitB(AngulerParser.BContext ctx) {
        BNode i=new BNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        i.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return i;
    }

    @Override
    public SmallNode visitSmall(AngulerParser.SmallContext ctx) {
        SmallNode i=new SmallNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        i.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return i;
    }

    @Override
    public MarkNode visitMark(AngulerParser.MarkContext ctx) {
        MarkNode i=new MarkNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        i.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return i;
    }

    @Override
    public EmNode visitEm(AngulerParser.EmContext ctx) {
        EmNode i=new EmNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        i.setTAG_VALUE(ctx.TAG_VALUE().getText());
        return i;
    }

    @Override
    public DivNode visitDiv(AngulerParser.DivContext ctx) {
        String inDiv = ctx.IN_DIV().getText();
        DivNode divNode = new DivNode(ctx.start.getLine(), ctx.start.getCharPositionInLine(), inDiv);
        List<DivBodyNode> divBodyNodes = new ArrayList<>();
        for (AngulerParser.Div_bodyContext bodyCtx : ctx.div_body()) {
            divBodyNodes.add((DivBodyNode) visit(bodyCtx));
        }
        divNode.setDivBodyNodeList(divBodyNodes);
        return divNode;
    }

    @Override
    public StylesNode visitStyles(AngulerParser.StylesContext ctx) {
        StylesNode styles = new StylesNode(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        try{
            if(!r_symbolTable.checkStyles())
                throw new ComponentPropertyRedefinitionException("Duplicate 'styles' found in @Component at line "+styles.getLine());
            r_symbolTable.addVariable("styles","array of String s",scopes.getLast(),styles.getLine(),styles.getColumn());
        }catch (ComponentPropertyRedefinitionException e){
            System.err.println("Semantic Error: "+e.getMessage());
        }
        scopes.add("styles");
        List<StylesBodyNode> bodyNodes = new ArrayList<>();
        for (AngulerParser.Styles_bodyContext bodyCtx : ctx.styles_body()) {
            bodyNodes.add((StylesBodyNode) visit(bodyCtx));
        }
        styles.setStylesBodyNodeList(bodyNodes);
        scopes.pop();
        return styles;
    }

    @Override
    public P_appNode visitP_app(AngulerParser.P_appContext ctx) {
        P_appNode p=new P_appNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        try{
            if(!rs_symboltable.checkApp())
                throw new DuplicateStylePropertyException("Duplicate style property '.app'  found in component at line "+p.getLine()+" . Each style property must be defined only once.");
            rs_symboltable.addVariable(".app","styles_element",scopes.getLast(),p.getLine(),p.getColumn());
        }catch (DuplicateStylePropertyException e){
            System.err.println("Semantic Error: "+e.getMessage());
        }
        scopes.add(".app");
        p.setCSS_BODY(ctx.CSS_BODY().getText());
        scopes.pop();
        return p;
    }

    @Override
    public P_listNode visitP_list(AngulerParser.P_listContext ctx) {
        P_listNode p=new P_listNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        r_symbolTable.addVariable(".product-list","styles_element",scopes.getLast(),p.getLine(),p.getColumn());
        scopes.add(".product-list");
        p.setCSS_BODY(ctx.CSS_BODY().getText());
        scopes.pop();
        return p;
    }

    @Override
    public P_cardNode visitP_card(AngulerParser.P_cardContext ctx) {
        P_cardNode p=new P_cardNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        try{
            if(!rs_symboltable.checkP_card())
                throw new DuplicateStylePropertyException("Duplicate style property '.product-card'  found in component at line "+p.getLine()+" . Each style property must be defined only once.");
            rs_symboltable.addVariable(".product-card","styles_element",scopes.getLast(),p.getLine(),p.getColumn());
        }catch (DuplicateStylePropertyException e){
            System.err.println("Semantic Error: "+e.getMessage());
        }
        scopes.add(".product-card");
        p.setCSS_BODY(ctx.CSS_BODY().getText());
        scopes.pop();
        return p;
    }

    @Override
    public P_card_hNode visitP_card_h(AngulerParser.P_card_hContext ctx) {
        P_card_hNode p=new P_card_hNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        try{
            if(!rs_symboltable.checkP_card_h())
                throw new DuplicateStylePropertyException("Duplicate style property '.product-card:hover'  found in component at line "+p.getLine()+" . Each style property must be defined only once.");
            rs_symboltable.addVariable(".product-card:hover","styles_element",scopes.getLast(),p.getLine(),p.getColumn());
        }catch (DuplicateStylePropertyException e){
            System.err.println("Semantic Error: "+e.getMessage());
        }
        scopes.add(".product-card:hover");
        p.setCSS_BODY(ctx.CSS_BODY().getText());
        scopes.pop();
        return p;
    }

    @Override
    public P_card_iNode visitP_card_i(AngulerParser.P_card_iContext ctx) {
        P_card_iNode p=new P_card_iNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        try{
            if(!rs_symboltable.checkP_card_i())
                throw new DuplicateStylePropertyException("Duplicate style property '.product-card img'  found in component at line "+p.getLine()+" . Each style property must be defined only once.");
            rs_symboltable.addVariable(".product-card img","styles_element",scopes.getLast(),p.getLine(),p.getColumn());
        }catch (DuplicateStylePropertyException e){
            System.err.println("Semantic Error: "+e.getMessage());
        }
        scopes.add(".product-card img");
        p.setCSS_BODY(ctx.CSS_BODY().getText());
        scopes.pop();
        return p;
    }

    @Override
    public P_detailNode visitP_detail(AngulerParser.P_detailContext ctx) {
        P_detailNode p=new P_detailNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        try{
            if(!rs_symboltable.checkP_details())
                throw new DuplicateStylePropertyException("Duplicate style property '.product-details'  found in component at line "+p.getLine()+" . Each style property must be defined only once.");
            rs_symboltable.addVariable(".product-details","styles_element",scopes.getLast(),p.getLine(),p.getColumn());
        }catch (DuplicateStylePropertyException e){
            System.err.println("Semantic Error: "+e.getMessage());
        }
        scopes.add(".product-details");
        p.setCSS_BODY(ctx.CSS_BODY().getText());
        scopes.pop();
        return p;
    }

    @Override
    public P_detail_iNode visitP_detail_i(AngulerParser.P_detail_iContext ctx) {
        P_detail_iNode p=new P_detail_iNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        try{
            if(!rs_symboltable.checkP_details_i())
                throw new DuplicateStylePropertyException("Duplicate style property '.product-details img'  found in component at line "+p.getLine()+" . Each style property must be defined only once.");
            rs_symboltable.addVariable(".product-details img","styles_element",scopes.getLast(),p.getLine(),p.getColumn());
        }catch (DuplicateStylePropertyException e){
            System.err.println("Semantic Error: "+e.getMessage());
        }
        scopes.add(".product-details img");
        p.setCSS_BODY(ctx.CSS_BODY().getText());
        scopes.pop();
        return p;
    }

    @Override
    public AppComponentNode visitAppComponent(AngulerParser.AppComponentContext ctx) {
        AppComponentNode appComponent = new AppComponentNode(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        scopes.add("AppComponent");
        List<AppComponentBodyNode> entries = new ArrayList<>();
        for (AngulerParser.AppComponent_bodyContext entryCtx : ctx.appComponent_body()) {
            AppComponentBodyNode entryNode = (AppComponentBodyNode) visit(entryCtx);
            if (entryNode instanceof AppComponentBodyNode) {
                entries.add((AppComponentBodyNode) entryNode);
            }
        }
        appComponent.setAppComponentBodyNodeList(entries);
        scopes.pop();
        return appComponent;
    }

    @Override
    public ProductsNode visitProducts_data(AngulerParser.Products_dataContext ctx) {
        return visitProducts(ctx.products());
    }

    @Override
    public SelectedProductNode visitSelectedProduct_data(AngulerParser.SelectedProduct_dataContext ctx) {
        return visitSelectedProduct(ctx.selectedProduct());
    }

    @Override
    public ClickNode visitClick_data(AngulerParser.Click_dataContext ctx) {
        return visitClick(ctx.click());
    }

    @Override
    public ProductsNode visitProducts(AngulerParser.ProductsContext ctx) {
        ProductsNode products=new ProductsNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        scopes.add("products array");
        products.setProductElementNode(visitProductElement(ctx.productElement()));
        scopes.pop();
        return products;
    }

    @Override
    public ProductElementNode visitProductElement(AngulerParser.ProductElementContext ctx) {
        List<ElementArrayNode> elementArrayList=new ArrayList<>();
        ProductElementNode productElement=new ProductElementNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        int a=0;
        for (AngulerParser.Element_ArrayContext elem:ctx.element_Array()){
            a++;
            scopes.add("Product "+a);
            elementArrayList.add(visitElement_Array(elem));
            scopes.pop();
        }
        productElement.setElementArrayNodeList(elementArrayList);
        v_symbolTable.addVariable("Product Element","Array",scopes.getLast(),productElement.getElementArrayNodeList().size()+" elements",productElement.getLine(),productElement.getColumn());
        return productElement;
    }

    @Override
    public ElementArrayNode visitElement_Array(AngulerParser.Element_ArrayContext ctx) {
        ElementArrayNode elementArray=new ElementArrayNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        elementArray.setElementBodyNode(visitElement_body(ctx.element_body()));
        return elementArray;
    }

    @Override
    public ElementBodyNode visitElement_body(AngulerParser.Element_bodyContext ctx) {
        List<ElementNameNode>elementNameList=new ArrayList<>();
        ElementBodyNode elementBody=new ElementBodyNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        for(AngulerParser.Element_nameContext elm: ctx.element_name()){
            elementNameList.add(visitElement_name(elm));
            v_symbolTable.addVariable(scopes.getLast().toString()+" "+elm.Element_name().getText(),"element of product",scopes.getLast(),elm.Element_value().getText(),elementBody.getLine(),elementBody.getColumn());
        }
        elementBody.setElementNameNodeList(elementNameList);
        return elementBody;
    }

    @Override
    public ElementNameNode visitElement_name(AngulerParser.Element_nameContext ctx) {
        ElementNameNode elementName=new ElementNameNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        elementName.setElement_name(ctx.Element_name().getText());
        elementName.setElement_value(ctx.Element_value().getText());
        return elementName;
    }

    @Override
    public SelectedProductNode visitSelectedProduct(AngulerParser.SelectedProductContext ctx) {
        SelectedProductNode selectedProduct=new SelectedProductNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        selectedProduct.setSelectedProduct(ctx.SelectedProduct().getText());
        v_symbolTable.addVariable("selectedProduct","Variable",scopes.getLast(),selectedProduct.getSelectedProduct(),selectedProduct.getLine(),selectedProduct.getColumn());
        return selectedProduct;
    }

    @Override
    public ClickNode visitClick(AngulerParser.ClickContext ctx) {
        ClickNode click=new ClickNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        scopes.add("click");
        click.setProductClick_Attribute(ctx.ProductClick_Attribute().getText());
        click.setProductClick_body(ctx.ProductClick_body().getText());
        scopes.pop();
        v_symbolTable.addVariable("onProductClick","Function",scopes.getLast(),click.getProductClick_body(),click.getLine(),click.getColumn());
        return click;
    }
}
