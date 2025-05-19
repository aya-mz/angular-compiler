package AST;

import gen.AngulerParser;
import gen.AngulerParserBaseVisitor;
import Classes.*;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends AngulerParserBaseVisitor {
    public BaseVisitor() {

    }

    @Override
    public AppNode visitApp(AngulerParser.AppContext ctx) {
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
        importFrom.setSTRING_LITERAL(ctx.STRING_LITERAL().toString());
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
        ComponentBodyNode componentBody=visitComponent_body(ctx.component_body());
        ComponentNode component=new ComponentNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        component.setComponentBodyNode(componentBody);
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
        selectorData.setSELECTOR_BODY(ctx.SELECTOR_BODY().toString());
        return selectorData;
    }

    @Override
    public StandaloneDataNode visitStandalone_data(AngulerParser.Standalone_dataContext ctx) {
        StandaloneDataNode standaloneData=new StandaloneDataNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        standaloneData.setSTANDALONE_VALUE(ctx.STANDALONE_VALUE().toString());
        return standaloneData;
    }

    @Override
    public ImportsDataNode visitImports_data(AngulerParser.Imports_dataContext ctx) {
        ImportsDataNode importsData=new ImportsDataNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        importsData.setSELECTOR_BODY(ctx.SELECTOR_BODY().toString());
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
        TemplateBodyNode templateBody=visitTemplate_body(ctx.template_body());
        TemplateNode template=new TemplateNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        template.setTemplateBodyNode(templateBody);
        return template;
    }

    @Override
    public TemplateBodyNode visitTemplate_body(AngulerParser.Template_bodyContext ctx) {
        List<DivBodyNode>divBody=new ArrayList<>();
        for (var divbody:ctx.div_body()){
            divBody.add((DivBodyNode) visit(divbody));
        }
        TemplateBodyNode templateBody=new TemplateBodyNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        templateBody.setIN_DIV(ctx.IN_DIV().toString());
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
        header.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return header;
    }

    @Override
    public SectionNode visitSection(AngulerParser.SectionContext ctx) {
        SectionNode section=new SectionNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        section.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return section;
    }

    @Override
    public ArticleNode visitArticle(AngulerParser.ArticleContext ctx) {
        ArticleNode article=new ArticleNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        article.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return article;
    }

    @Override
    public AsideNode visitAside(AngulerParser.AsideContext ctx) {
        AsideNode aside=new AsideNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        aside.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return aside;
    }

    @Override
    public DetailsNode visitDetails(AngulerParser.DetailsContext ctx) {
        DetailsNode details=new DetailsNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        details.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return details;
    }

    @Override
    public ANode visitA(AngulerParser.AContext ctx) {
        ANode a=new ANode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        a.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return a;
    }

    @Override
    public OlNode visitOl(AngulerParser.OlContext ctx) {
        OlNode ol=new OlNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        ol.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return ol;
    }

    @Override
    public UlNode visitUl(AngulerParser.UlContext ctx) {
        UlNode ul=new UlNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        ul.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return ul;
    }

    @Override
    public LiNode visitLi(AngulerParser.LiContext ctx) {
        LiNode li=new LiNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        li.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return li;
    }

    @Override
    public NavNode visitNav(AngulerParser.NavContext ctx) {
        NavNode nav=new NavNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        nav.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return nav;
    }

    @Override
    public H1Node visitH1(AngulerParser.H1Context ctx) {
        H1Node h=new H1Node(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        h.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return h;
    }

    @Override
    public H2Node visitH2(AngulerParser.H2Context ctx) {
        H2Node h=new H2Node(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        h.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return h;
    }

    @Override
    public H3Node visitH3(AngulerParser.H3Context ctx) {
        H3Node h=new H3Node(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        h.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return h;
    }

    @Override
    public H4Node visitH4(AngulerParser.H4Context ctx) {
        H4Node h=new H4Node(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        h.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return h;
    }

    @Override
    public H5Node visitH5(AngulerParser.H5Context ctx) {
        H5Node h=new H5Node(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        h.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return h;
    }

    @Override
    public H6Node visitH6(AngulerParser.H6Context ctx) {
        H6Node h=new H6Node(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        h.setTAG_VALUE(ctx.TAG_VALUE().toString());
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
        img.setIMG_Open(ctx.IMG_Open().toString());
        img.setIMG_Close(ctx.IMG_Close().toString());
        return img;
    }

    @Override
    public SpanNode visitSpan(AngulerParser.SpanContext ctx) {
        SpanNode span=new SpanNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        span.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return span;
    }

    @Override
    public StrongNode visitStrong(AngulerParser.StrongContext ctx) {
        StrongNode strong=new StrongNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        strong.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return strong;
    }

    @Override
    public INode visitI(AngulerParser.IContext ctx) {
        INode i=new INode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        i.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return i;
    }

    @Override
    public UNode visitU(AngulerParser.UContext ctx) {
        UNode i=new UNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        i.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return i;
    }

    @Override
    public BNode visitB(AngulerParser.BContext ctx) {
        BNode i=new BNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        i.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return i;
    }

    @Override
    public SmallNode visitSmall(AngulerParser.SmallContext ctx) {
        SmallNode i=new SmallNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        i.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return i;
    }

    @Override
    public MarkNode visitMark(AngulerParser.MarkContext ctx) {
        MarkNode i=new MarkNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        i.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return i;
    }

    @Override
    public EmNode visitEm(AngulerParser.EmContext ctx) {
        EmNode i=new EmNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        i.setTAG_VALUE(ctx.TAG_VALUE().toString());
        return i;
    }

    @Override
    public DivNode visitDiv(AngulerParser.DivContext ctx) {
        String inDiv = ctx.IN_DIV().toString();
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
        List<StylesBodyNode> bodyNodes = new ArrayList<>();
        for (AngulerParser.Styles_bodyContext bodyCtx : ctx.styles_body()) {
            bodyNodes.add((StylesBodyNode) visit(bodyCtx));
        }

        StylesNode styles = new StylesNode(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        styles.setStylesBodyNodeList(bodyNodes);
        return styles;
    }

    @Override
    public P_appNode visitP_app(AngulerParser.P_appContext ctx) {
        P_appNode p=new P_appNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        p.setCSS_BODY(ctx.CSS_BODY().toString());
        return p;
    }

    @Override
    public P_listNode visitP_list(AngulerParser.P_listContext ctx) {
        P_listNode p=new P_listNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        p.setCSS_BODY(ctx.CSS_BODY().toString());
        return p;
    }

    @Override
    public P_cardNode visitP_card(AngulerParser.P_cardContext ctx) {
        P_cardNode p=new P_cardNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        p.setCSS_BODY(ctx.CSS_BODY().toString());
        return p;
    }

    @Override
    public P_card_hNode visitP_card_h(AngulerParser.P_card_hContext ctx) {
        P_card_hNode p=new P_card_hNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        p.setCSS_BODY(ctx.CSS_BODY().toString());
        return p;
    }

    @Override
    public P_card_iNode visitP_card_i(AngulerParser.P_card_iContext ctx) {
        P_card_iNode p=new P_card_iNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        p.setCSS_BODY(ctx.CSS_BODY().toString());
        return p;
    }

    @Override
    public P_detailNode visitP_detail(AngulerParser.P_detailContext ctx) {
        P_detailNode p=new P_detailNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        p.setCSS_BODY(ctx.CSS_BODY().toString());
        return p;
    }

    @Override
    public P_detail_iNode visitP_detail_i(AngulerParser.P_detail_iContext ctx) {
        P_detail_iNode p=new P_detail_iNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        p.setCSS_BODY(ctx.CSS_BODY().toString());
        return p;
    }

    @Override
    public AppComponentNode visitAppComponent(AngulerParser.AppComponentContext ctx) {
        AppComponentNode appComponent = new AppComponentNode(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        List<AppComponentBodyNode> entries = new ArrayList<>();
        for (AngulerParser.AppComponent_bodyContext entryCtx : ctx.appComponent_body()) {
            AppComponentBodyNode entryNode = (AppComponentBodyNode) visit(entryCtx);
            if (entryNode instanceof AppComponentBodyNode) {
                entries.add((AppComponentBodyNode) entryNode);
            }
        }
        appComponent.setAppComponentBodyNodeList(entries);
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
        products.setProductElementNode(visitProductElement(ctx.productElement()));
        return products;
    }

    @Override
    public ProductElementNode visitProductElement(AngulerParser.ProductElementContext ctx) {
        List<ElementArrayNode> elementArrayList=new ArrayList<>();
        ProductElementNode productElement=new ProductElementNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        for (AngulerParser.Element_ArrayContext elem:ctx.element_Array()){
            elementArrayList.add(visitElement_Array(elem));
        }
        productElement.setElementArrayNodeList(elementArrayList);
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
        }
        elementBody.setElementNameNodeList(elementNameList);
        return elementBody;
    }

    @Override
    public ElementNameNode visitElement_name(AngulerParser.Element_nameContext ctx) {
        ElementNameNode elementName=new ElementNameNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        elementName.setElement_name(ctx.Element_name().toString());
        elementName.setElement_value(ctx.Element_value().toString());
        return elementName;
    }

    @Override
    public SelectedProductNode visitSelectedProduct(AngulerParser.SelectedProductContext ctx) {
        SelectedProductNode selectedProduct=new SelectedProductNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        selectedProduct.setSelectedProduct(ctx.SelectedProduct().toString());
        return selectedProduct;
    }

    @Override
    public ClickNode visitClick(AngulerParser.ClickContext ctx) {
        ClickNode click=new ClickNode(ctx.start.getLine(),ctx.start.getCharPositionInLine());
        click.setProductClick_Attribute(ctx.ProductClick_Attribute().toString());
        click.setProductClick_body(ctx.ProductClick_body().toString());
        return click;
    }
}
