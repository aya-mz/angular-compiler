// Generated from D:/IntelliJ projects/Anguler_compiler/src/AngulerParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngulerParser}.
 */
public interface AngulerParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngulerParser#app}.
	 * @param ctx the parse tree
	 */
	void enterApp(AngulerParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#app}.
	 * @param ctx the parse tree
	 */
	void exitApp(AngulerParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#imporT}.
	 * @param ctx the parse tree
	 */
	void enterImporT(AngulerParser.ImporTContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#imporT}.
	 * @param ctx the parse tree
	 */
	void exitImporT(AngulerParser.ImporTContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngulerParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngulerParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void enterImportFrom(AngulerParser.ImportFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void exitImportFrom(AngulerParser.ImportFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#importedSymbols}.
	 * @param ctx the parse tree
	 */
	void enterImportedSymbols(AngulerParser.ImportedSymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#importedSymbols}.
	 * @param ctx the parse tree
	 */
	void exitImportedSymbols(AngulerParser.ImportedSymbolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(AngulerParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(AngulerParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#component_body}.
	 * @param ctx the parse tree
	 */
	void enterComponent_body(AngulerParser.Component_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#component_body}.
	 * @param ctx the parse tree
	 */
	void exitComponent_body(AngulerParser.Component_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selector_data}
	 * labeled alternative in {@link AngulerParser#component_entry}.
	 * @param ctx the parse tree
	 */
	void enterSelector_data(AngulerParser.Selector_dataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selector_data}
	 * labeled alternative in {@link AngulerParser#component_entry}.
	 * @param ctx the parse tree
	 */
	void exitSelector_data(AngulerParser.Selector_dataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code standalone_data}
	 * labeled alternative in {@link AngulerParser#component_entry}.
	 * @param ctx the parse tree
	 */
	void enterStandalone_data(AngulerParser.Standalone_dataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code standalone_data}
	 * labeled alternative in {@link AngulerParser#component_entry}.
	 * @param ctx the parse tree
	 */
	void exitStandalone_data(AngulerParser.Standalone_dataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imports_data}
	 * labeled alternative in {@link AngulerParser#component_entry}.
	 * @param ctx the parse tree
	 */
	void enterImports_data(AngulerParser.Imports_dataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imports_data}
	 * labeled alternative in {@link AngulerParser#component_entry}.
	 * @param ctx the parse tree
	 */
	void exitImports_data(AngulerParser.Imports_dataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code template_data}
	 * labeled alternative in {@link AngulerParser#component_entry}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_data(AngulerParser.Template_dataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code template_data}
	 * labeled alternative in {@link AngulerParser#component_entry}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_data(AngulerParser.Template_dataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styles_data}
	 * labeled alternative in {@link AngulerParser#component_entry}.
	 * @param ctx the parse tree
	 */
	void enterStyles_data(AngulerParser.Styles_dataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styles_data}
	 * labeled alternative in {@link AngulerParser#component_entry}.
	 * @param ctx the parse tree
	 */
	void exitStyles_data(AngulerParser.Styles_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(AngulerParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(AngulerParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#template_body}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_body(AngulerParser.Template_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#template_body}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_body(AngulerParser.Template_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div_data}
	 * labeled alternative in {@link AngulerParser#div_body}.
	 * @param ctx the parse tree
	 */
	void enterDiv_data(AngulerParser.Div_dataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div_data}
	 * labeled alternative in {@link AngulerParser#div_body}.
	 * @param ctx the parse tree
	 */
	void exitDiv_data(AngulerParser.Div_dataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code html_element_data}
	 * labeled alternative in {@link AngulerParser#div_body}.
	 * @param ctx the parse tree
	 */
	void enterHtml_element_data(AngulerParser.Html_element_dataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code html_element_data}
	 * labeled alternative in {@link AngulerParser#div_body}.
	 * @param ctx the parse tree
	 */
	void exitHtml_element_data(AngulerParser.Html_element_dataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code header}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterHeader(AngulerParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code header}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitHeader(AngulerParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code section}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterSection(AngulerParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code section}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitSection(AngulerParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code article}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterArticle(AngulerParser.ArticleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code article}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitArticle(AngulerParser.ArticleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aside}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterAside(AngulerParser.AsideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aside}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitAside(AngulerParser.AsideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code details}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterDetails(AngulerParser.DetailsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code details}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitDetails(AngulerParser.DetailsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code a}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterA(AngulerParser.AContext ctx);
	/**
	 * Exit a parse tree produced by the {@code a}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitA(AngulerParser.AContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ol}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterOl(AngulerParser.OlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ol}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitOl(AngulerParser.OlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ul}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterUl(AngulerParser.UlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ul}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitUl(AngulerParser.UlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code li}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterLi(AngulerParser.LiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code li}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitLi(AngulerParser.LiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nav}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterNav(AngulerParser.NavContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nav}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitNav(AngulerParser.NavContext ctx);
	/**
	 * Enter a parse tree produced by the {@code h1}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterH1(AngulerParser.H1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code h1}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitH1(AngulerParser.H1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code h2}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterH2(AngulerParser.H2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code h2}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitH2(AngulerParser.H2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code h3}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterH3(AngulerParser.H3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code h3}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitH3(AngulerParser.H3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code h4}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterH4(AngulerParser.H4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code h4}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitH4(AngulerParser.H4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code h5}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterH5(AngulerParser.H5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code h5}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitH5(AngulerParser.H5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code h6}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterH6(AngulerParser.H6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code h6}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitH6(AngulerParser.H6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code p}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterP(AngulerParser.PContext ctx);
	/**
	 * Exit a parse tree produced by the {@code p}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitP(AngulerParser.PContext ctx);
	/**
	 * Enter a parse tree produced by the {@code img}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterImg(AngulerParser.ImgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code img}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitImg(AngulerParser.ImgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code span}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterSpan(AngulerParser.SpanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code span}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitSpan(AngulerParser.SpanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strong}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterStrong(AngulerParser.StrongContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strong}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitStrong(AngulerParser.StrongContext ctx);
	/**
	 * Enter a parse tree produced by the {@code i}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterI(AngulerParser.IContext ctx);
	/**
	 * Exit a parse tree produced by the {@code i}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitI(AngulerParser.IContext ctx);
	/**
	 * Enter a parse tree produced by the {@code u}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterU(AngulerParser.UContext ctx);
	/**
	 * Exit a parse tree produced by the {@code u}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitU(AngulerParser.UContext ctx);
	/**
	 * Enter a parse tree produced by the {@code b}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterB(AngulerParser.BContext ctx);
	/**
	 * Exit a parse tree produced by the {@code b}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitB(AngulerParser.BContext ctx);
	/**
	 * Enter a parse tree produced by the {@code small}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterSmall(AngulerParser.SmallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code small}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitSmall(AngulerParser.SmallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mark}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterMark(AngulerParser.MarkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mark}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitMark(AngulerParser.MarkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code em}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterEm(AngulerParser.EmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code em}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitEm(AngulerParser.EmContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(AngulerParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(AngulerParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#styles}.
	 * @param ctx the parse tree
	 */
	void enterStyles(AngulerParser.StylesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#styles}.
	 * @param ctx the parse tree
	 */
	void exitStyles(AngulerParser.StylesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code p_app}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 */
	void enterP_app(AngulerParser.P_appContext ctx);
	/**
	 * Exit a parse tree produced by the {@code p_app}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 */
	void exitP_app(AngulerParser.P_appContext ctx);
	/**
	 * Enter a parse tree produced by the {@code p_list}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 */
	void enterP_list(AngulerParser.P_listContext ctx);
	/**
	 * Exit a parse tree produced by the {@code p_list}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 */
	void exitP_list(AngulerParser.P_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code p_card}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 */
	void enterP_card(AngulerParser.P_cardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code p_card}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 */
	void exitP_card(AngulerParser.P_cardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code p_card_h}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 */
	void enterP_card_h(AngulerParser.P_card_hContext ctx);
	/**
	 * Exit a parse tree produced by the {@code p_card_h}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 */
	void exitP_card_h(AngulerParser.P_card_hContext ctx);
	/**
	 * Enter a parse tree produced by the {@code p_card_i}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 */
	void enterP_card_i(AngulerParser.P_card_iContext ctx);
	/**
	 * Exit a parse tree produced by the {@code p_card_i}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 */
	void exitP_card_i(AngulerParser.P_card_iContext ctx);
	/**
	 * Enter a parse tree produced by the {@code p_detail}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 */
	void enterP_detail(AngulerParser.P_detailContext ctx);
	/**
	 * Exit a parse tree produced by the {@code p_detail}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 */
	void exitP_detail(AngulerParser.P_detailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code p_detail_i}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 */
	void enterP_detail_i(AngulerParser.P_detail_iContext ctx);
	/**
	 * Exit a parse tree produced by the {@code p_detail_i}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 */
	void exitP_detail_i(AngulerParser.P_detail_iContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#appComponent}.
	 * @param ctx the parse tree
	 */
	void enterAppComponent(AngulerParser.AppComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#appComponent}.
	 * @param ctx the parse tree
	 */
	void exitAppComponent(AngulerParser.AppComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code products_data}
	 * labeled alternative in {@link AngulerParser#appComponent_body}.
	 * @param ctx the parse tree
	 */
	void enterProducts_data(AngulerParser.Products_dataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code products_data}
	 * labeled alternative in {@link AngulerParser#appComponent_body}.
	 * @param ctx the parse tree
	 */
	void exitProducts_data(AngulerParser.Products_dataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectedProduct_data}
	 * labeled alternative in {@link AngulerParser#appComponent_body}.
	 * @param ctx the parse tree
	 */
	void enterSelectedProduct_data(AngulerParser.SelectedProduct_dataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectedProduct_data}
	 * labeled alternative in {@link AngulerParser#appComponent_body}.
	 * @param ctx the parse tree
	 */
	void exitSelectedProduct_data(AngulerParser.SelectedProduct_dataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code click_data}
	 * labeled alternative in {@link AngulerParser#appComponent_body}.
	 * @param ctx the parse tree
	 */
	void enterClick_data(AngulerParser.Click_dataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code click_data}
	 * labeled alternative in {@link AngulerParser#appComponent_body}.
	 * @param ctx the parse tree
	 */
	void exitClick_data(AngulerParser.Click_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#products}.
	 * @param ctx the parse tree
	 */
	void enterProducts(AngulerParser.ProductsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#products}.
	 * @param ctx the parse tree
	 */
	void exitProducts(AngulerParser.ProductsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#productElement}.
	 * @param ctx the parse tree
	 */
	void enterProductElement(AngulerParser.ProductElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#productElement}.
	 * @param ctx the parse tree
	 */
	void exitProductElement(AngulerParser.ProductElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#element_Array}.
	 * @param ctx the parse tree
	 */
	void enterElement_Array(AngulerParser.Element_ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#element_Array}.
	 * @param ctx the parse tree
	 */
	void exitElement_Array(AngulerParser.Element_ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#element_body}.
	 * @param ctx the parse tree
	 */
	void enterElement_body(AngulerParser.Element_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#element_body}.
	 * @param ctx the parse tree
	 */
	void exitElement_body(AngulerParser.Element_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#element_name}.
	 * @param ctx the parse tree
	 */
	void enterElement_name(AngulerParser.Element_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#element_name}.
	 * @param ctx the parse tree
	 */
	void exitElement_name(AngulerParser.Element_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#selectedProduct}.
	 * @param ctx the parse tree
	 */
	void enterSelectedProduct(AngulerParser.SelectedProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#selectedProduct}.
	 * @param ctx the parse tree
	 */
	void exitSelectedProduct(AngulerParser.SelectedProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#click}.
	 * @param ctx the parse tree
	 */
	void enterClick(AngulerParser.ClickContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#click}.
	 * @param ctx the parse tree
	 */
	void exitClick(AngulerParser.ClickContext ctx);
}