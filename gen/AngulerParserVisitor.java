// Generated from D:/IntelliJ projects/Anguler_compiler/src/AngulerParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngulerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngulerParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngulerParser#app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(AngulerParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#imporT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImporT(AngulerParser.ImporTContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngulerParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#importFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFrom(AngulerParser.ImportFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#importedSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportedSymbols(AngulerParser.ImportedSymbolsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(AngulerParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#component_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_body(AngulerParser.Component_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selector_data}
	 * labeled alternative in {@link AngulerParser#component_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector_data(AngulerParser.Selector_dataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code standalone_data}
	 * labeled alternative in {@link AngulerParser#component_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalone_data(AngulerParser.Standalone_dataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imports_data}
	 * labeled alternative in {@link AngulerParser#component_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports_data(AngulerParser.Imports_dataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code template_data}
	 * labeled alternative in {@link AngulerParser#component_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_data(AngulerParser.Template_dataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styles_data}
	 * labeled alternative in {@link AngulerParser#component_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyles_data(AngulerParser.Styles_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(AngulerParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#template_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_body(AngulerParser.Template_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div_data}
	 * labeled alternative in {@link AngulerParser#div_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv_data(AngulerParser.Div_dataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code html_element_data}
	 * labeled alternative in {@link AngulerParser#div_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_element_data(AngulerParser.Html_element_dataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code header}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(AngulerParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code section}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(AngulerParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code article}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticle(AngulerParser.ArticleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aside}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAside(AngulerParser.AsideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code details}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetails(AngulerParser.DetailsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code a}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(AngulerParser.AContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ol}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOl(AngulerParser.OlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ul}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUl(AngulerParser.UlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code li}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLi(AngulerParser.LiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nav}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNav(AngulerParser.NavContext ctx);
	/**
	 * Visit a parse tree produced by the {@code h1}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH1(AngulerParser.H1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code h2}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH2(AngulerParser.H2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code h3}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH3(AngulerParser.H3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code h4}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH4(AngulerParser.H4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code h5}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH5(AngulerParser.H5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code h6}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH6(AngulerParser.H6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code p}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(AngulerParser.PContext ctx);
	/**
	 * Visit a parse tree produced by the {@code img}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImg(AngulerParser.ImgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code span}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpan(AngulerParser.SpanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strong}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrong(AngulerParser.StrongContext ctx);
	/**
	 * Visit a parse tree produced by the {@code i}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI(AngulerParser.IContext ctx);
	/**
	 * Visit a parse tree produced by the {@code u}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitU(AngulerParser.UContext ctx);
	/**
	 * Visit a parse tree produced by the {@code b}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(AngulerParser.BContext ctx);
	/**
	 * Visit a parse tree produced by the {@code small}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall(AngulerParser.SmallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mark}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMark(AngulerParser.MarkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code em}
	 * labeled alternative in {@link AngulerParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEm(AngulerParser.EmContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(AngulerParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#styles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyles(AngulerParser.StylesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code p_app}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_app(AngulerParser.P_appContext ctx);
	/**
	 * Visit a parse tree produced by the {@code p_list}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_list(AngulerParser.P_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code p_card}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_card(AngulerParser.P_cardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code p_card_h}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_card_h(AngulerParser.P_card_hContext ctx);
	/**
	 * Visit a parse tree produced by the {@code p_card_i}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_card_i(AngulerParser.P_card_iContext ctx);
	/**
	 * Visit a parse tree produced by the {@code p_detail}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_detail(AngulerParser.P_detailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code p_detail_i}
	 * labeled alternative in {@link AngulerParser#styles_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_detail_i(AngulerParser.P_detail_iContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#appComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppComponent(AngulerParser.AppComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code products_data}
	 * labeled alternative in {@link AngulerParser#appComponent_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProducts_data(AngulerParser.Products_dataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectedProduct_data}
	 * labeled alternative in {@link AngulerParser#appComponent_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectedProduct_data(AngulerParser.SelectedProduct_dataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code click_data}
	 * labeled alternative in {@link AngulerParser#appComponent_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClick_data(AngulerParser.Click_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#products}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProducts(AngulerParser.ProductsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#productElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductElement(AngulerParser.ProductElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#element_Array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_Array(AngulerParser.Element_ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#element_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_body(AngulerParser.Element_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#element_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_name(AngulerParser.Element_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#selectedProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectedProduct(AngulerParser.SelectedProductContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#click}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClick(AngulerParser.ClickContext ctx);
}