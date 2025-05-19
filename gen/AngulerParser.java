// Generated from D:/IntelliJ projects/Anguler_compiler/src/AngulerParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngulerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, DOUBLE_QUOT=2, BOOLEAN=3, LARACE=4, RARACE=5, LBRACE=6, RBRACE=7, 
		SEMI=8, WORD_VALUE=9, STRING_LITERAL=10, IMPORT=11, FROM=12, IMPORT_LRACE=13, 
		MODULE_NAME=14, IMPORT_RRACE=15, Component_OPEN=16, APPComponent_OPEN=17, 
		Component_COMMA=18, Component_OPEN_RACE=19, SELECTOR=20, SELECTOR_QUOT=21, 
		SELECTOR_BODY=22, STANDALONE=23, STANDALONE_VALUE=24, IMPORTS=25, IMPORTS_LRACE=26, 
		IMPORTS_RRACE=27, TEMPLATE_OPEN=28, STYLES_OPEN=29, Component_CLOSE_RACE=30, 
		Component_CLOSE=31, OPEN_DIV=32, Template_Close=33, Styles_Lrace=34, CSS_BODY=35, 
		Styles_Rrace=36, P_app=37, P_list=38, P_card=39, P_card_h=40, P_card_i=41, 
		P_detail=42, P_detail_i=43, STYLES_CLOSE=44, OPEN_NEW_DIV=45, IN_DIV=46, 
		TAG_VALUE=47, H1_Open=48, H1_Close=49, H2_Open=50, H2_Close=51, H3_Open=52, 
		H3_Close=53, H4_Open=54, H4_Close=55, H5_Open=56, H5_Close=57, H6_Open=58, 
		H6_Close=59, IMG_Open=60, IMG_Close=61, P_Open=62, P_Close=63, SPAN_Open=64, 
		SPAN_Close=65, STRONG_Open=66, STRONG_Close=67, EM_Open=68, EM_Close=69, 
		I_Open=70, I_Close=71, U_Open=72, U_Close=73, B_Open=74, B_Close=75, SMALL_Open=76, 
		SMALL_Close=77, MARK_Open=78, MARK_Close=79, HEADER_Open=80, HEADER_Close=81, 
		SECTION_Open=82, SECTION_Close=83, ARTICLE_Open=84, ARTICLE_Close=85, 
		ASIDE_Open=86, ASIDE_Close=87, DETAILS_Open=88, DETAILS_Close=89, A_Open=90, 
		A_Close=91, UL_Open=92, UL_Close=93, OL_Open=94, OL_Close=95, LI_Open=96, 
		LI_Close=97, NAV_Open=98, NAV_Close=99, CLOSE_DIV=100, APPComponent_RACE_OPEN=101, 
		Array_Product_OPEN=102, SelectedProduct=103, OnProductClick=104, APPComponent_RACE_CLOSE=105, 
		Array_COMMA=106, Array_Product_RACE_OPEN=107, Array_Product_RACE_CLOSE=108, 
		Array_element_Open=109, Element_name=110, Element_value=111, Element_quot=112, 
		Array_element_Close=113, Array_Product_SEMI=114, ProductClick_Attribute=115, 
		ProductClick_Open=116, ProductClick_body=117, ProductClick_SEMI=118, ProductClick_Close=119, 
		Space=120, Elment_value_AB=121;
	public static final int
		RULE_app = 0, RULE_imporT = 1, RULE_importStatement = 2, RULE_importFrom = 3, 
		RULE_importedSymbols = 4, RULE_component = 5, RULE_component_body = 6, 
		RULE_component_entry = 7, RULE_template = 8, RULE_template_body = 9, RULE_div_body = 10, 
		RULE_html_element = 11, RULE_div = 12, RULE_styles = 13, RULE_styles_body = 14, 
		RULE_appComponent = 15, RULE_appComponent_body = 16, RULE_products = 17, 
		RULE_productElement = 18, RULE_element_Array = 19, RULE_element_body = 20, 
		RULE_element_name = 21, RULE_selectedProduct = 22, RULE_click = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"app", "imporT", "importStatement", "importFrom", "importedSymbols", 
			"component", "component_body", "component_entry", "template", "template_body", 
			"div_body", "html_element", "div", "styles", "styles_body", "appComponent", 
			"appComponent_body", "products", "productElement", "element_Array", "element_body", 
			"element_name", "selectedProduct", "click"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'\"'", null, "'['", "']'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMA", "DOUBLE_QUOT", "BOOLEAN", "LARACE", "RARACE", "LBRACE", 
			"RBRACE", "SEMI", "WORD_VALUE", "STRING_LITERAL", "IMPORT", "FROM", "IMPORT_LRACE", 
			"MODULE_NAME", "IMPORT_RRACE", "Component_OPEN", "APPComponent_OPEN", 
			"Component_COMMA", "Component_OPEN_RACE", "SELECTOR", "SELECTOR_QUOT", 
			"SELECTOR_BODY", "STANDALONE", "STANDALONE_VALUE", "IMPORTS", "IMPORTS_LRACE", 
			"IMPORTS_RRACE", "TEMPLATE_OPEN", "STYLES_OPEN", "Component_CLOSE_RACE", 
			"Component_CLOSE", "OPEN_DIV", "Template_Close", "Styles_Lrace", "CSS_BODY", 
			"Styles_Rrace", "P_app", "P_list", "P_card", "P_card_h", "P_card_i", 
			"P_detail", "P_detail_i", "STYLES_CLOSE", "OPEN_NEW_DIV", "IN_DIV", "TAG_VALUE", 
			"H1_Open", "H1_Close", "H2_Open", "H2_Close", "H3_Open", "H3_Close", 
			"H4_Open", "H4_Close", "H5_Open", "H5_Close", "H6_Open", "H6_Close", 
			"IMG_Open", "IMG_Close", "P_Open", "P_Close", "SPAN_Open", "SPAN_Close", 
			"STRONG_Open", "STRONG_Close", "EM_Open", "EM_Close", "I_Open", "I_Close", 
			"U_Open", "U_Close", "B_Open", "B_Close", "SMALL_Open", "SMALL_Close", 
			"MARK_Open", "MARK_Close", "HEADER_Open", "HEADER_Close", "SECTION_Open", 
			"SECTION_Close", "ARTICLE_Open", "ARTICLE_Close", "ASIDE_Open", "ASIDE_Close", 
			"DETAILS_Open", "DETAILS_Close", "A_Open", "A_Close", "UL_Open", "UL_Close", 
			"OL_Open", "OL_Close", "LI_Open", "LI_Close", "NAV_Open", "NAV_Close", 
			"CLOSE_DIV", "APPComponent_RACE_OPEN", "Array_Product_OPEN", "SelectedProduct", 
			"OnProductClick", "APPComponent_RACE_CLOSE", "Array_COMMA", "Array_Product_RACE_OPEN", 
			"Array_Product_RACE_CLOSE", "Array_element_Open", "Element_name", "Element_value", 
			"Element_quot", "Array_element_Close", "Array_Product_SEMI", "ProductClick_Attribute", 
			"ProductClick_Open", "ProductClick_body", "ProductClick_SEMI", "ProductClick_Close", 
			"Space", "Elment_value_AB"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngulerParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngulerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppContext extends ParserRuleContext {
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public AppComponentContext appComponent() {
			return getRuleContext(AppComponentContext.class,0);
		}
		public List<ImporTContext> imporT() {
			return getRuleContexts(ImporTContext.class);
		}
		public ImporTContext imporT(int i) {
			return getRuleContext(ImporTContext.class,i);
		}
		public AppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppContext app() throws RecognitionException {
		AppContext _localctx = new AppContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_app);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				imporT();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
			setState(53);
			component();
			setState(54);
			appComponent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImporTContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngulerParser.SEMI, 0); }
		public ImporTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imporT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterImporT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitImporT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitImporT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImporTContext imporT() throws RecognitionException {
		ImporTContext _localctx = new ImporTContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imporT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			importStatement();
			setState(57);
			importFrom();
			setState(58);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngulerParser.IMPORT, 0); }
		public TerminalNode IMPORT_LRACE() { return getToken(AngulerParser.IMPORT_LRACE, 0); }
		public TerminalNode IMPORT_RRACE() { return getToken(AngulerParser.IMPORT_RRACE, 0); }
		public List<ImportedSymbolsContext> importedSymbols() {
			return getRuleContexts(ImportedSymbolsContext.class);
		}
		public ImportedSymbolsContext importedSymbols(int i) {
			return getRuleContext(ImportedSymbolsContext.class,i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(IMPORT);
			setState(61);
			match(IMPORT_LRACE);
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				importedSymbols();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MODULE_NAME );
			setState(67);
			match(IMPORT_RRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(AngulerParser.FROM, 0); }
		public List<TerminalNode> DOUBLE_QUOT() { return getTokens(AngulerParser.DOUBLE_QUOT); }
		public TerminalNode DOUBLE_QUOT(int i) {
			return getToken(AngulerParser.DOUBLE_QUOT, i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public ImportFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterImportFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitImportFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitImportFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromContext importFrom() throws RecognitionException {
		ImportFromContext _localctx = new ImportFromContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(FROM);
			setState(70);
			match(DOUBLE_QUOT);
			setState(71);
			match(STRING_LITERAL);
			setState(72);
			match(DOUBLE_QUOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportedSymbolsContext extends ParserRuleContext {
		public List<TerminalNode> MODULE_NAME() { return getTokens(AngulerParser.MODULE_NAME); }
		public TerminalNode MODULE_NAME(int i) {
			return getToken(AngulerParser.MODULE_NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public ImportedSymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importedSymbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterImportedSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitImportedSymbols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitImportedSymbols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportedSymbolsContext importedSymbols() throws RecognitionException {
		ImportedSymbolsContext _localctx = new ImportedSymbolsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importedSymbols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(MODULE_NAME);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75);
				match(COMMA);
				setState(76);
				match(MODULE_NAME);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode Component_OPEN() { return getToken(AngulerParser.Component_OPEN, 0); }
		public TerminalNode Component_OPEN_RACE() { return getToken(AngulerParser.Component_OPEN_RACE, 0); }
		public Component_bodyContext component_body() {
			return getRuleContext(Component_bodyContext.class,0);
		}
		public TerminalNode Component_CLOSE_RACE() { return getToken(AngulerParser.Component_CLOSE_RACE, 0); }
		public TerminalNode Component_CLOSE() { return getToken(AngulerParser.Component_CLOSE, 0); }
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(Component_OPEN);
			setState(83);
			match(Component_OPEN_RACE);
			setState(84);
			component_body();
			setState(85);
			match(Component_CLOSE_RACE);
			setState(86);
			match(Component_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Component_bodyContext extends ParserRuleContext {
		public List<Component_entryContext> component_entry() {
			return getRuleContexts(Component_entryContext.class);
		}
		public Component_entryContext component_entry(int i) {
			return getRuleContext(Component_entryContext.class,i);
		}
		public List<TerminalNode> Component_COMMA() { return getTokens(AngulerParser.Component_COMMA); }
		public TerminalNode Component_COMMA(int i) {
			return getToken(AngulerParser.Component_COMMA, i);
		}
		public Component_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterComponent_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitComponent_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitComponent_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_bodyContext component_body() throws RecognitionException {
		Component_bodyContext _localctx = new Component_bodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_component_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			component_entry();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Component_COMMA) {
				{
				{
				setState(89);
				match(Component_COMMA);
				setState(90);
				component_entry();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Component_entryContext extends ParserRuleContext {
		public Component_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_entry; }
	 
		public Component_entryContext() { }
		public void copyFrom(Component_entryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Styles_dataContext extends Component_entryContext {
		public StylesContext styles() {
			return getRuleContext(StylesContext.class,0);
		}
		public Styles_dataContext(Component_entryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStyles_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStyles_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStyles_data(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Imports_dataContext extends Component_entryContext {
		public TerminalNode IMPORTS() { return getToken(AngulerParser.IMPORTS, 0); }
		public TerminalNode IMPORTS_LRACE() { return getToken(AngulerParser.IMPORTS_LRACE, 0); }
		public TerminalNode SELECTOR_BODY() { return getToken(AngulerParser.SELECTOR_BODY, 0); }
		public TerminalNode IMPORTS_RRACE() { return getToken(AngulerParser.IMPORTS_RRACE, 0); }
		public Imports_dataContext(Component_entryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterImports_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitImports_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitImports_data(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Standalone_dataContext extends Component_entryContext {
		public TerminalNode STANDALONE() { return getToken(AngulerParser.STANDALONE, 0); }
		public TerminalNode STANDALONE_VALUE() { return getToken(AngulerParser.STANDALONE_VALUE, 0); }
		public Standalone_dataContext(Component_entryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStandalone_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStandalone_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStandalone_data(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Template_dataContext extends Component_entryContext {
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public Template_dataContext(Component_entryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterTemplate_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitTemplate_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitTemplate_data(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Selector_dataContext extends Component_entryContext {
		public TerminalNode SELECTOR() { return getToken(AngulerParser.SELECTOR, 0); }
		public List<TerminalNode> SELECTOR_QUOT() { return getTokens(AngulerParser.SELECTOR_QUOT); }
		public TerminalNode SELECTOR_QUOT(int i) {
			return getToken(AngulerParser.SELECTOR_QUOT, i);
		}
		public TerminalNode SELECTOR_BODY() { return getToken(AngulerParser.SELECTOR_BODY, 0); }
		public Selector_dataContext(Component_entryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSelector_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSelector_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSelector_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_entryContext component_entry() throws RecognitionException {
		Component_entryContext _localctx = new Component_entryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_component_entry);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new Selector_dataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(SELECTOR);
				setState(97);
				match(SELECTOR_QUOT);
				setState(98);
				match(SELECTOR_BODY);
				setState(99);
				match(SELECTOR_QUOT);
				}
				break;
			case STANDALONE:
				_localctx = new Standalone_dataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(STANDALONE);
				setState(101);
				match(STANDALONE_VALUE);
				}
				break;
			case IMPORTS:
				_localctx = new Imports_dataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(IMPORTS);
				setState(103);
				match(IMPORTS_LRACE);
				setState(104);
				match(SELECTOR_BODY);
				setState(105);
				match(IMPORTS_RRACE);
				}
				break;
			case TEMPLATE_OPEN:
				_localctx = new Template_dataContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				template();
				}
				break;
			case STYLES_OPEN:
				_localctx = new Styles_dataContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				styles();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_OPEN() { return getToken(AngulerParser.TEMPLATE_OPEN, 0); }
		public Template_bodyContext template_body() {
			return getRuleContext(Template_bodyContext.class,0);
		}
		public TerminalNode Template_Close() { return getToken(AngulerParser.Template_Close, 0); }
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(TEMPLATE_OPEN);
			setState(111);
			template_body();
			setState(112);
			match(Template_Close);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Template_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_DIV() { return getToken(AngulerParser.OPEN_DIV, 0); }
		public TerminalNode IN_DIV() { return getToken(AngulerParser.IN_DIV, 0); }
		public TerminalNode CLOSE_DIV() { return getToken(AngulerParser.CLOSE_DIV, 0); }
		public List<Div_bodyContext> div_body() {
			return getRuleContexts(Div_bodyContext.class);
		}
		public Div_bodyContext div_body(int i) {
			return getRuleContext(Div_bodyContext.class,i);
		}
		public Template_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterTemplate_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitTemplate_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitTemplate_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_bodyContext template_body() throws RecognitionException {
		Template_bodyContext _localctx = new Template_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_template_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(OPEN_DIV);
			setState(115);
			match(IN_DIV);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				div_body();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 12009599006321321L) != 0) );
			setState(121);
			match(CLOSE_DIV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Div_bodyContext extends ParserRuleContext {
		public Div_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_body; }
	 
		public Div_bodyContext() { }
		public void copyFrom(Div_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Div_dataContext extends Div_bodyContext {
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public Div_dataContext(Div_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterDiv_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitDiv_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitDiv_data(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Html_element_dataContext extends Div_bodyContext {
		public Html_elementContext html_element() {
			return getRuleContext(Html_elementContext.class,0);
		}
		public Html_element_dataContext(Div_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterHtml_element_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitHtml_element_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitHtml_element_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Div_bodyContext div_body() throws RecognitionException {
		Div_bodyContext _localctx = new Div_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_div_body);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_NEW_DIV:
				_localctx = new Div_dataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				div();
				}
				break;
			case H1_Open:
			case H2_Open:
			case H3_Open:
			case H4_Open:
			case H5_Open:
			case H6_Open:
			case IMG_Open:
			case P_Open:
			case SPAN_Open:
			case STRONG_Open:
			case EM_Open:
			case I_Open:
			case U_Open:
			case B_Open:
			case SMALL_Open:
			case MARK_Open:
			case HEADER_Open:
			case SECTION_Open:
			case ARTICLE_Open:
			case ASIDE_Open:
			case DETAILS_Open:
			case A_Open:
			case UL_Open:
			case OL_Open:
			case LI_Open:
			case NAV_Open:
				_localctx = new Html_element_dataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				html_element();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Html_elementContext extends ParserRuleContext {
		public Html_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_element; }
	 
		public Html_elementContext() { }
		public void copyFrom(Html_elementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallContext extends Html_elementContext {
		public TerminalNode SMALL_Open() { return getToken(AngulerParser.SMALL_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode SMALL_Close() { return getToken(AngulerParser.SMALL_Close, 0); }
		public SmallContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSmall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSmall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSmall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImgContext extends Html_elementContext {
		public TerminalNode IMG_Open() { return getToken(AngulerParser.IMG_Open, 0); }
		public TerminalNode IMG_Close() { return getToken(AngulerParser.IMG_Close, 0); }
		public ImgContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterImg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitImg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitImg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrongContext extends Html_elementContext {
		public TerminalNode STRONG_Open() { return getToken(AngulerParser.STRONG_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode STRONG_Close() { return getToken(AngulerParser.STRONG_Close, 0); }
		public StrongContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStrong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStrong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStrong(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H1Context extends Html_elementContext {
		public TerminalNode H1_Open() { return getToken(AngulerParser.H1_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode H1_Close() { return getToken(AngulerParser.H1_Close, 0); }
		public H1Context(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterH1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitH1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitH1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SectionContext extends Html_elementContext {
		public TerminalNode SECTION_Open() { return getToken(AngulerParser.SECTION_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode SECTION_Close() { return getToken(AngulerParser.SECTION_Close, 0); }
		public SectionContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H2Context extends Html_elementContext {
		public TerminalNode H2_Open() { return getToken(AngulerParser.H2_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode H2_Close() { return getToken(AngulerParser.H2_Close, 0); }
		public H2Context(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterH2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitH2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitH2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H3Context extends Html_elementContext {
		public TerminalNode H3_Open() { return getToken(AngulerParser.H3_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode H3_Close() { return getToken(AngulerParser.H3_Close, 0); }
		public H3Context(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterH3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitH3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitH3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H4Context extends Html_elementContext {
		public TerminalNode H4_Open() { return getToken(AngulerParser.H4_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode H4_Close() { return getToken(AngulerParser.H4_Close, 0); }
		public H4Context(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterH4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitH4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitH4(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H5Context extends Html_elementContext {
		public TerminalNode H5_Open() { return getToken(AngulerParser.H5_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode H5_Close() { return getToken(AngulerParser.H5_Close, 0); }
		public H5Context(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterH5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitH5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitH5(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H6Context extends Html_elementContext {
		public TerminalNode H6_Open() { return getToken(AngulerParser.H6_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode H6_Close() { return getToken(AngulerParser.H6_Close, 0); }
		public H6Context(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterH6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitH6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitH6(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UlContext extends Html_elementContext {
		public TerminalNode UL_Open() { return getToken(AngulerParser.UL_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode UL_Close() { return getToken(AngulerParser.UL_Close, 0); }
		public UlContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterUl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitUl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitUl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DetailsContext extends Html_elementContext {
		public TerminalNode DETAILS_Open() { return getToken(AngulerParser.DETAILS_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode DETAILS_Close() { return getToken(AngulerParser.DETAILS_Close, 0); }
		public DetailsContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterDetails(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitDetails(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitDetails(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OlContext extends Html_elementContext {
		public TerminalNode OL_Open() { return getToken(AngulerParser.OL_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode OL_Close() { return getToken(AngulerParser.OL_Close, 0); }
		public OlContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterOl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitOl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitOl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AContext extends Html_elementContext {
		public TerminalNode A_Open() { return getToken(AngulerParser.A_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode A_Close() { return getToken(AngulerParser.A_Close, 0); }
		public AContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NavContext extends Html_elementContext {
		public TerminalNode NAV_Open() { return getToken(AngulerParser.NAV_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode NAV_Close() { return getToken(AngulerParser.NAV_Close, 0); }
		public NavContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNav(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNav(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNav(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BContext extends Html_elementContext {
		public TerminalNode B_Open() { return getToken(AngulerParser.B_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode B_Close() { return getToken(AngulerParser.B_Close, 0); }
		public BContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitB(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmContext extends Html_elementContext {
		public TerminalNode EM_Open() { return getToken(AngulerParser.EM_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode EM_Close() { return getToken(AngulerParser.EM_Close, 0); }
		public EmContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterEm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitEm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitEm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IContext extends Html_elementContext {
		public TerminalNode I_Open() { return getToken(AngulerParser.I_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode I_Close() { return getToken(AngulerParser.I_Close, 0); }
		public IContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitI(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArticleContext extends Html_elementContext {
		public TerminalNode ARTICLE_Open() { return getToken(AngulerParser.ARTICLE_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode ARTICLE_Close() { return getToken(AngulerParser.ARTICLE_Close, 0); }
		public ArticleContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterArticle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitArticle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitArticle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PContext extends Html_elementContext {
		public TerminalNode P_Open() { return getToken(AngulerParser.P_Open, 0); }
		public TerminalNode P_Close() { return getToken(AngulerParser.P_Close, 0); }
		public List<TerminalNode> TAG_VALUE() { return getTokens(AngulerParser.TAG_VALUE); }
		public TerminalNode TAG_VALUE(int i) {
			return getToken(AngulerParser.TAG_VALUE, i);
		}
		public PContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsideContext extends Html_elementContext {
		public TerminalNode ASIDE_Open() { return getToken(AngulerParser.ASIDE_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode ASIDE_Close() { return getToken(AngulerParser.ASIDE_Close, 0); }
		public AsideContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterAside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitAside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitAside(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UContext extends Html_elementContext {
		public TerminalNode U_Open() { return getToken(AngulerParser.U_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode U_Close() { return getToken(AngulerParser.U_Close, 0); }
		public UContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterU(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitU(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitU(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HeaderContext extends Html_elementContext {
		public TerminalNode HEADER_Open() { return getToken(AngulerParser.HEADER_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode HEADER_Close() { return getToken(AngulerParser.HEADER_Close, 0); }
		public HeaderContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiContext extends Html_elementContext {
		public TerminalNode LI_Open() { return getToken(AngulerParser.LI_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode LI_Close() { return getToken(AngulerParser.LI_Close, 0); }
		public LiContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterLi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitLi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitLi(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MarkContext extends Html_elementContext {
		public TerminalNode MARK_Open() { return getToken(AngulerParser.MARK_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode MARK_Close() { return getToken(AngulerParser.MARK_Close, 0); }
		public MarkContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMark(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMark(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpanContext extends Html_elementContext {
		public TerminalNode SPAN_Open() { return getToken(AngulerParser.SPAN_Open, 0); }
		public TerminalNode TAG_VALUE() { return getToken(AngulerParser.TAG_VALUE, 0); }
		public TerminalNode SPAN_Close() { return getToken(AngulerParser.SPAN_Close, 0); }
		public SpanContext(Html_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSpan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSpan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSpan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_elementContext html_element() throws RecognitionException {
		Html_elementContext _localctx = new Html_elementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_html_element);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEADER_Open:
				_localctx = new HeaderContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(HEADER_Open);
				setState(128);
				match(TAG_VALUE);
				setState(129);
				match(HEADER_Close);
				}
				break;
			case SECTION_Open:
				_localctx = new SectionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(SECTION_Open);
				setState(131);
				match(TAG_VALUE);
				setState(132);
				match(SECTION_Close);
				}
				break;
			case ARTICLE_Open:
				_localctx = new ArticleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(ARTICLE_Open);
				setState(134);
				match(TAG_VALUE);
				setState(135);
				match(ARTICLE_Close);
				}
				break;
			case ASIDE_Open:
				_localctx = new AsideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(ASIDE_Open);
				setState(137);
				match(TAG_VALUE);
				setState(138);
				match(ASIDE_Close);
				}
				break;
			case DETAILS_Open:
				_localctx = new DetailsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(DETAILS_Open);
				setState(140);
				match(TAG_VALUE);
				setState(141);
				match(DETAILS_Close);
				}
				break;
			case A_Open:
				_localctx = new AContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				match(A_Open);
				setState(143);
				match(TAG_VALUE);
				setState(144);
				match(A_Close);
				}
				break;
			case OL_Open:
				_localctx = new OlContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				match(OL_Open);
				setState(146);
				match(TAG_VALUE);
				setState(147);
				match(OL_Close);
				}
				break;
			case UL_Open:
				_localctx = new UlContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(148);
				match(UL_Open);
				setState(149);
				match(TAG_VALUE);
				setState(150);
				match(UL_Close);
				}
				break;
			case LI_Open:
				_localctx = new LiContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
				match(LI_Open);
				setState(152);
				match(TAG_VALUE);
				setState(153);
				match(LI_Close);
				}
				break;
			case NAV_Open:
				_localctx = new NavContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(154);
				match(NAV_Open);
				setState(155);
				match(TAG_VALUE);
				setState(156);
				match(NAV_Close);
				}
				break;
			case H1_Open:
				_localctx = new H1Context(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(157);
				match(H1_Open);
				setState(158);
				match(TAG_VALUE);
				setState(159);
				match(H1_Close);
				}
				break;
			case H2_Open:
				_localctx = new H2Context(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(160);
				match(H2_Open);
				setState(161);
				match(TAG_VALUE);
				setState(162);
				match(H2_Close);
				}
				break;
			case H3_Open:
				_localctx = new H3Context(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(163);
				match(H3_Open);
				setState(164);
				match(TAG_VALUE);
				setState(165);
				match(H3_Close);
				}
				break;
			case H4_Open:
				_localctx = new H4Context(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(166);
				match(H4_Open);
				setState(167);
				match(TAG_VALUE);
				setState(168);
				match(H4_Close);
				}
				break;
			case H5_Open:
				_localctx = new H5Context(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(169);
				match(H5_Open);
				setState(170);
				match(TAG_VALUE);
				setState(171);
				match(H5_Close);
				}
				break;
			case H6_Open:
				_localctx = new H6Context(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(172);
				match(H6_Open);
				setState(173);
				match(TAG_VALUE);
				setState(174);
				match(H6_Close);
				}
				break;
			case P_Open:
				_localctx = new PContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(175);
				match(P_Open);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_VALUE) {
					{
					{
					setState(176);
					match(TAG_VALUE);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				match(P_Close);
				}
				break;
			case IMG_Open:
				_localctx = new ImgContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(183);
				match(IMG_Open);
				setState(184);
				match(IMG_Close);
				}
				break;
			case SPAN_Open:
				_localctx = new SpanContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(185);
				match(SPAN_Open);
				setState(186);
				match(TAG_VALUE);
				setState(187);
				match(SPAN_Close);
				}
				break;
			case STRONG_Open:
				_localctx = new StrongContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(188);
				match(STRONG_Open);
				setState(189);
				match(TAG_VALUE);
				setState(190);
				match(STRONG_Close);
				}
				break;
			case I_Open:
				_localctx = new IContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(191);
				match(I_Open);
				setState(192);
				match(TAG_VALUE);
				setState(193);
				match(I_Close);
				}
				break;
			case U_Open:
				_localctx = new UContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(194);
				match(U_Open);
				setState(195);
				match(TAG_VALUE);
				setState(196);
				match(U_Close);
				}
				break;
			case B_Open:
				_localctx = new BContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(197);
				match(B_Open);
				setState(198);
				match(TAG_VALUE);
				setState(199);
				match(B_Close);
				}
				break;
			case SMALL_Open:
				_localctx = new SmallContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(200);
				match(SMALL_Open);
				setState(201);
				match(TAG_VALUE);
				setState(202);
				match(SMALL_Close);
				}
				break;
			case MARK_Open:
				_localctx = new MarkContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(203);
				match(MARK_Open);
				setState(204);
				match(TAG_VALUE);
				setState(205);
				match(MARK_Close);
				}
				break;
			case EM_Open:
				_localctx = new EmContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(206);
				match(EM_Open);
				setState(207);
				match(TAG_VALUE);
				setState(208);
				match(EM_Close);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends ParserRuleContext {
		public TerminalNode OPEN_NEW_DIV() { return getToken(AngulerParser.OPEN_NEW_DIV, 0); }
		public TerminalNode IN_DIV() { return getToken(AngulerParser.IN_DIV, 0); }
		public TerminalNode CLOSE_DIV() { return getToken(AngulerParser.CLOSE_DIV, 0); }
		public List<Div_bodyContext> div_body() {
			return getRuleContexts(Div_bodyContext.class);
		}
		public Div_bodyContext div_body(int i) {
			return getRuleContext(Div_bodyContext.class,i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(OPEN_NEW_DIV);
			setState(212);
			match(IN_DIV);
			setState(214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
				div_body();
				}
				}
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 12009599006321321L) != 0) );
			setState(218);
			match(CLOSE_DIV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesContext extends ParserRuleContext {
		public TerminalNode STYLES_OPEN() { return getToken(AngulerParser.STYLES_OPEN, 0); }
		public TerminalNode STYLES_CLOSE() { return getToken(AngulerParser.STYLES_CLOSE, 0); }
		public List<Styles_bodyContext> styles_body() {
			return getRuleContexts(Styles_bodyContext.class);
		}
		public Styles_bodyContext styles_body(int i) {
			return getRuleContext(Styles_bodyContext.class,i);
		}
		public StylesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStyles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStyles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStyles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesContext styles() throws RecognitionException {
		StylesContext _localctx = new StylesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_styles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(STYLES_OPEN);
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				styles_body();
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17454747090944L) != 0) );
			setState(226);
			match(STYLES_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Styles_bodyContext extends ParserRuleContext {
		public Styles_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styles_body; }
	 
		public Styles_bodyContext() { }
		public void copyFrom(Styles_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class P_listContext extends Styles_bodyContext {
		public TerminalNode P_list() { return getToken(AngulerParser.P_list, 0); }
		public TerminalNode Styles_Lrace() { return getToken(AngulerParser.Styles_Lrace, 0); }
		public TerminalNode CSS_BODY() { return getToken(AngulerParser.CSS_BODY, 0); }
		public TerminalNode Styles_Rrace() { return getToken(AngulerParser.Styles_Rrace, 0); }
		public P_listContext(Styles_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterP_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitP_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitP_list(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class P_appContext extends Styles_bodyContext {
		public TerminalNode P_app() { return getToken(AngulerParser.P_app, 0); }
		public TerminalNode Styles_Lrace() { return getToken(AngulerParser.Styles_Lrace, 0); }
		public TerminalNode CSS_BODY() { return getToken(AngulerParser.CSS_BODY, 0); }
		public TerminalNode Styles_Rrace() { return getToken(AngulerParser.Styles_Rrace, 0); }
		public P_appContext(Styles_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterP_app(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitP_app(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitP_app(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class P_card_iContext extends Styles_bodyContext {
		public TerminalNode P_card_i() { return getToken(AngulerParser.P_card_i, 0); }
		public TerminalNode Styles_Lrace() { return getToken(AngulerParser.Styles_Lrace, 0); }
		public TerminalNode CSS_BODY() { return getToken(AngulerParser.CSS_BODY, 0); }
		public TerminalNode Styles_Rrace() { return getToken(AngulerParser.Styles_Rrace, 0); }
		public P_card_iContext(Styles_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterP_card_i(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitP_card_i(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitP_card_i(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class P_detail_iContext extends Styles_bodyContext {
		public TerminalNode P_detail_i() { return getToken(AngulerParser.P_detail_i, 0); }
		public TerminalNode Styles_Lrace() { return getToken(AngulerParser.Styles_Lrace, 0); }
		public TerminalNode CSS_BODY() { return getToken(AngulerParser.CSS_BODY, 0); }
		public TerminalNode Styles_Rrace() { return getToken(AngulerParser.Styles_Rrace, 0); }
		public P_detail_iContext(Styles_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterP_detail_i(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitP_detail_i(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitP_detail_i(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class P_card_hContext extends Styles_bodyContext {
		public TerminalNode P_card_h() { return getToken(AngulerParser.P_card_h, 0); }
		public TerminalNode Styles_Lrace() { return getToken(AngulerParser.Styles_Lrace, 0); }
		public TerminalNode CSS_BODY() { return getToken(AngulerParser.CSS_BODY, 0); }
		public TerminalNode Styles_Rrace() { return getToken(AngulerParser.Styles_Rrace, 0); }
		public P_card_hContext(Styles_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterP_card_h(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitP_card_h(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitP_card_h(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class P_cardContext extends Styles_bodyContext {
		public TerminalNode P_card() { return getToken(AngulerParser.P_card, 0); }
		public TerminalNode Styles_Lrace() { return getToken(AngulerParser.Styles_Lrace, 0); }
		public TerminalNode CSS_BODY() { return getToken(AngulerParser.CSS_BODY, 0); }
		public TerminalNode Styles_Rrace() { return getToken(AngulerParser.Styles_Rrace, 0); }
		public P_cardContext(Styles_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterP_card(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitP_card(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitP_card(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class P_detailContext extends Styles_bodyContext {
		public TerminalNode P_detail() { return getToken(AngulerParser.P_detail, 0); }
		public TerminalNode Styles_Lrace() { return getToken(AngulerParser.Styles_Lrace, 0); }
		public TerminalNode CSS_BODY() { return getToken(AngulerParser.CSS_BODY, 0); }
		public TerminalNode Styles_Rrace() { return getToken(AngulerParser.Styles_Rrace, 0); }
		public P_detailContext(Styles_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterP_detail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitP_detail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitP_detail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Styles_bodyContext styles_body() throws RecognitionException {
		Styles_bodyContext _localctx = new Styles_bodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_styles_body);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_app:
				_localctx = new P_appContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(P_app);
				setState(229);
				match(Styles_Lrace);
				setState(230);
				match(CSS_BODY);
				setState(231);
				match(Styles_Rrace);
				}
				break;
			case P_list:
				_localctx = new P_listContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(P_list);
				setState(233);
				match(Styles_Lrace);
				setState(234);
				match(CSS_BODY);
				setState(235);
				match(Styles_Rrace);
				}
				break;
			case P_card:
				_localctx = new P_cardContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(P_card);
				setState(237);
				match(Styles_Lrace);
				setState(238);
				match(CSS_BODY);
				setState(239);
				match(Styles_Rrace);
				}
				break;
			case P_card_h:
				_localctx = new P_card_hContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(P_card_h);
				setState(241);
				match(Styles_Lrace);
				setState(242);
				match(CSS_BODY);
				setState(243);
				match(Styles_Rrace);
				}
				break;
			case P_card_i:
				_localctx = new P_card_iContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(P_card_i);
				setState(245);
				match(Styles_Lrace);
				setState(246);
				match(CSS_BODY);
				setState(247);
				match(Styles_Rrace);
				}
				break;
			case P_detail:
				_localctx = new P_detailContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				match(P_detail);
				setState(249);
				match(Styles_Lrace);
				setState(250);
				match(CSS_BODY);
				setState(251);
				match(Styles_Rrace);
				}
				break;
			case P_detail_i:
				_localctx = new P_detail_iContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				match(P_detail_i);
				setState(253);
				match(Styles_Lrace);
				setState(254);
				match(CSS_BODY);
				setState(255);
				match(Styles_Rrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppComponentContext extends ParserRuleContext {
		public TerminalNode APPComponent_OPEN() { return getToken(AngulerParser.APPComponent_OPEN, 0); }
		public TerminalNode APPComponent_RACE_OPEN() { return getToken(AngulerParser.APPComponent_RACE_OPEN, 0); }
		public TerminalNode APPComponent_RACE_CLOSE() { return getToken(AngulerParser.APPComponent_RACE_CLOSE, 0); }
		public List<AppComponent_bodyContext> appComponent_body() {
			return getRuleContexts(AppComponent_bodyContext.class);
		}
		public AppComponent_bodyContext appComponent_body(int i) {
			return getRuleContext(AppComponent_bodyContext.class,i);
		}
		public AppComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterAppComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitAppComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitAppComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppComponentContext appComponent() throws RecognitionException {
		AppComponentContext _localctx = new AppComponentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_appComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(APPComponent_OPEN);
			setState(259);
			match(APPComponent_RACE_OPEN);
			setState(261); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(260);
				appComponent_body();
				}
				}
				setState(263); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 7L) != 0) );
			setState(265);
			match(APPComponent_RACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppComponent_bodyContext extends ParserRuleContext {
		public AppComponent_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appComponent_body; }
	 
		public AppComponent_bodyContext() { }
		public void copyFrom(AppComponent_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Products_dataContext extends AppComponent_bodyContext {
		public ProductsContext products() {
			return getRuleContext(ProductsContext.class,0);
		}
		public Products_dataContext(AppComponent_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterProducts_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitProducts_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitProducts_data(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectedProduct_dataContext extends AppComponent_bodyContext {
		public SelectedProductContext selectedProduct() {
			return getRuleContext(SelectedProductContext.class,0);
		}
		public SelectedProduct_dataContext(AppComponent_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSelectedProduct_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSelectedProduct_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSelectedProduct_data(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Click_dataContext extends AppComponent_bodyContext {
		public ClickContext click() {
			return getRuleContext(ClickContext.class,0);
		}
		public Click_dataContext(AppComponent_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterClick_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitClick_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitClick_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppComponent_bodyContext appComponent_body() throws RecognitionException {
		AppComponent_bodyContext _localctx = new AppComponent_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_appComponent_body);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array_Product_OPEN:
				_localctx = new Products_dataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				products();
				}
				break;
			case SelectedProduct:
				_localctx = new SelectedProduct_dataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				selectedProduct();
				}
				break;
			case OnProductClick:
				_localctx = new Click_dataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				click();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProductsContext extends ParserRuleContext {
		public TerminalNode Array_Product_OPEN() { return getToken(AngulerParser.Array_Product_OPEN, 0); }
		public TerminalNode Array_Product_RACE_OPEN() { return getToken(AngulerParser.Array_Product_RACE_OPEN, 0); }
		public ProductElementContext productElement() {
			return getRuleContext(ProductElementContext.class,0);
		}
		public TerminalNode Array_Product_RACE_CLOSE() { return getToken(AngulerParser.Array_Product_RACE_CLOSE, 0); }
		public TerminalNode Array_Product_SEMI() { return getToken(AngulerParser.Array_Product_SEMI, 0); }
		public ProductsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_products; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterProducts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitProducts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitProducts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductsContext products() throws RecognitionException {
		ProductsContext _localctx = new ProductsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_products);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(Array_Product_OPEN);
			setState(273);
			match(Array_Product_RACE_OPEN);
			setState(274);
			productElement();
			setState(275);
			match(Array_Product_RACE_CLOSE);
			setState(276);
			match(Array_Product_SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProductElementContext extends ParserRuleContext {
		public List<Element_ArrayContext> element_Array() {
			return getRuleContexts(Element_ArrayContext.class);
		}
		public Element_ArrayContext element_Array(int i) {
			return getRuleContext(Element_ArrayContext.class,i);
		}
		public List<TerminalNode> Array_COMMA() { return getTokens(AngulerParser.Array_COMMA); }
		public TerminalNode Array_COMMA(int i) {
			return getToken(AngulerParser.Array_COMMA, i);
		}
		public ProductElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterProductElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitProductElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitProductElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductElementContext productElement() throws RecognitionException {
		ProductElementContext _localctx = new ProductElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_productElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			element_Array();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Array_COMMA) {
				{
				{
				setState(279);
				match(Array_COMMA);
				setState(280);
				element_Array();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Element_ArrayContext extends ParserRuleContext {
		public TerminalNode Array_element_Open() { return getToken(AngulerParser.Array_element_Open, 0); }
		public Element_bodyContext element_body() {
			return getRuleContext(Element_bodyContext.class,0);
		}
		public TerminalNode Array_element_Close() { return getToken(AngulerParser.Array_element_Close, 0); }
		public Element_ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_Array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterElement_Array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitElement_Array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitElement_Array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_ArrayContext element_Array() throws RecognitionException {
		Element_ArrayContext _localctx = new Element_ArrayContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_element_Array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(Array_element_Open);
			setState(287);
			element_body();
			setState(288);
			match(Array_element_Close);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Element_bodyContext extends ParserRuleContext {
		public List<Element_nameContext> element_name() {
			return getRuleContexts(Element_nameContext.class);
		}
		public Element_nameContext element_name(int i) {
			return getRuleContext(Element_nameContext.class,i);
		}
		public List<TerminalNode> Array_COMMA() { return getTokens(AngulerParser.Array_COMMA); }
		public TerminalNode Array_COMMA(int i) {
			return getToken(AngulerParser.Array_COMMA, i);
		}
		public Element_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterElement_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitElement_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitElement_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_bodyContext element_body() throws RecognitionException {
		Element_bodyContext _localctx = new Element_bodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_element_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			element_name();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Array_COMMA) {
				{
				{
				setState(291);
				match(Array_COMMA);
				setState(292);
				element_name();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Element_nameContext extends ParserRuleContext {
		public TerminalNode Element_name() { return getToken(AngulerParser.Element_name, 0); }
		public List<TerminalNode> Element_quot() { return getTokens(AngulerParser.Element_quot); }
		public TerminalNode Element_quot(int i) {
			return getToken(AngulerParser.Element_quot, i);
		}
		public TerminalNode Element_value() { return getToken(AngulerParser.Element_value, 0); }
		public Element_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterElement_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitElement_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitElement_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_nameContext element_name() throws RecognitionException {
		Element_nameContext _localctx = new Element_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_element_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(Element_name);
			setState(299);
			match(Element_quot);
			setState(300);
			match(Element_value);
			setState(301);
			match(Element_quot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectedProductContext extends ParserRuleContext {
		public TerminalNode SelectedProduct() { return getToken(AngulerParser.SelectedProduct, 0); }
		public SelectedProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectedProduct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSelectedProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSelectedProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSelectedProduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectedProductContext selectedProduct() throws RecognitionException {
		SelectedProductContext _localctx = new SelectedProductContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selectedProduct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(SelectedProduct);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClickContext extends ParserRuleContext {
		public TerminalNode OnProductClick() { return getToken(AngulerParser.OnProductClick, 0); }
		public TerminalNode ProductClick_Attribute() { return getToken(AngulerParser.ProductClick_Attribute, 0); }
		public TerminalNode ProductClick_Open() { return getToken(AngulerParser.ProductClick_Open, 0); }
		public TerminalNode ProductClick_body() { return getToken(AngulerParser.ProductClick_body, 0); }
		public TerminalNode ProductClick_SEMI() { return getToken(AngulerParser.ProductClick_SEMI, 0); }
		public TerminalNode ProductClick_Close() { return getToken(AngulerParser.ProductClick_Close, 0); }
		public ClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_click; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClickContext click() throws RecognitionException {
		ClickContext _localctx = new ClickContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_click);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(OnProductClick);
			setState(306);
			match(ProductClick_Attribute);
			setState(307);
			match(ProductClick_Open);
			setState(308);
			match(ProductClick_body);
			setState(309);
			match(ProductClick_SEMI);
			setState(310);
			match(ProductClick_Close);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001y\u0139\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0004\u0000"+
		"2\b\u0000\u000b\u0000\f\u00003\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u0002@\b\u0002\u000b\u0002\f\u0002A\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004N\b\u0004\n\u0004\f\u0004Q\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\\\b\u0006\n\u0006\f\u0006"+
		"_\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007m\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0004\tv\b\t\u000b\t\f\tw\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0003\n~\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00b2\b\u000b\n"+
		"\u000b\f\u000b\u00b5\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00d2\b\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u00d7\b\f\u000b\f"+
		"\f\f\u00d8\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u00df\b\r\u000b\r\f"+
		"\r\u00e0\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0101\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f"+
		"\u0106\b\u000f\u000b\u000f\f\u000f\u0107\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u010f\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u011a\b\u0012\n\u0012\f\u0012\u011d\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0126\b\u0014\n\u0014\f\u0014\u0129\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"\u0000\u0000\u0151\u00001\u0001\u0000\u0000\u0000\u00028\u0001\u0000\u0000"+
		"\u0000\u0004<\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000\b"+
		"J\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000\u0000\fX\u0001\u0000\u0000"+
		"\u0000\u000el\u0001\u0000\u0000\u0000\u0010n\u0001\u0000\u0000\u0000\u0012"+
		"r\u0001\u0000\u0000\u0000\u0014}\u0001\u0000\u0000\u0000\u0016\u00d1\u0001"+
		"\u0000\u0000\u0000\u0018\u00d3\u0001\u0000\u0000\u0000\u001a\u00dc\u0001"+
		"\u0000\u0000\u0000\u001c\u0100\u0001\u0000\u0000\u0000\u001e\u0102\u0001"+
		"\u0000\u0000\u0000 \u010e\u0001\u0000\u0000\u0000\"\u0110\u0001\u0000"+
		"\u0000\u0000$\u0116\u0001\u0000\u0000\u0000&\u011e\u0001\u0000\u0000\u0000"+
		"(\u0122\u0001\u0000\u0000\u0000*\u012a\u0001\u0000\u0000\u0000,\u012f"+
		"\u0001\u0000\u0000\u0000.\u0131\u0001\u0000\u0000\u000002\u0003\u0002"+
		"\u0001\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"56\u0003\n\u0005\u000067\u0003\u001e\u000f\u00007\u0001\u0001\u0000\u0000"+
		"\u000089\u0003\u0004\u0002\u00009:\u0003\u0006\u0003\u0000:;\u0005\b\u0000"+
		"\u0000;\u0003\u0001\u0000\u0000\u0000<=\u0005\u000b\u0000\u0000=?\u0005"+
		"\r\u0000\u0000>@\u0003\b\u0004\u0000?>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CD\u0005\u000f\u0000\u0000D\u0005\u0001\u0000"+
		"\u0000\u0000EF\u0005\f\u0000\u0000FG\u0005\u0002\u0000\u0000GH\u0005\n"+
		"\u0000\u0000HI\u0005\u0002\u0000\u0000I\u0007\u0001\u0000\u0000\u0000"+
		"JO\u0005\u000e\u0000\u0000KL\u0005\u0001\u0000\u0000LN\u0005\u000e\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000P\t\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RS\u0005\u0010\u0000\u0000ST\u0005\u0013\u0000\u0000"+
		"TU\u0003\f\u0006\u0000UV\u0005\u001e\u0000\u0000VW\u0005\u001f\u0000\u0000"+
		"W\u000b\u0001\u0000\u0000\u0000X]\u0003\u000e\u0007\u0000YZ\u0005\u0012"+
		"\u0000\u0000Z\\\u0003\u000e\u0007\u0000[Y\u0001\u0000\u0000\u0000\\_\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^\r\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005\u0014\u0000"+
		"\u0000ab\u0005\u0015\u0000\u0000bc\u0005\u0016\u0000\u0000cm\u0005\u0015"+
		"\u0000\u0000de\u0005\u0017\u0000\u0000em\u0005\u0018\u0000\u0000fg\u0005"+
		"\u0019\u0000\u0000gh\u0005\u001a\u0000\u0000hi\u0005\u0016\u0000\u0000"+
		"im\u0005\u001b\u0000\u0000jm\u0003\u0010\b\u0000km\u0003\u001a\r\u0000"+
		"l`\u0001\u0000\u0000\u0000ld\u0001\u0000\u0000\u0000lf\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000m\u000f\u0001"+
		"\u0000\u0000\u0000no\u0005\u001c\u0000\u0000op\u0003\u0012\t\u0000pq\u0005"+
		"!\u0000\u0000q\u0011\u0001\u0000\u0000\u0000rs\u0005 \u0000\u0000su\u0005"+
		".\u0000\u0000tv\u0003\u0014\n\u0000ut\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000yz\u0005d\u0000\u0000z\u0013\u0001\u0000\u0000"+
		"\u0000{~\u0003\u0018\f\u0000|~\u0003\u0016\u000b\u0000}{\u0001\u0000\u0000"+
		"\u0000}|\u0001\u0000\u0000\u0000~\u0015\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005P\u0000\u0000\u0080\u0081\u0005/\u0000\u0000\u0081\u00d2\u0005"+
		"Q\u0000\u0000\u0082\u0083\u0005R\u0000\u0000\u0083\u0084\u0005/\u0000"+
		"\u0000\u0084\u00d2\u0005S\u0000\u0000\u0085\u0086\u0005T\u0000\u0000\u0086"+
		"\u0087\u0005/\u0000\u0000\u0087\u00d2\u0005U\u0000\u0000\u0088\u0089\u0005"+
		"V\u0000\u0000\u0089\u008a\u0005/\u0000\u0000\u008a\u00d2\u0005W\u0000"+
		"\u0000\u008b\u008c\u0005X\u0000\u0000\u008c\u008d\u0005/\u0000\u0000\u008d"+
		"\u00d2\u0005Y\u0000\u0000\u008e\u008f\u0005Z\u0000\u0000\u008f\u0090\u0005"+
		"/\u0000\u0000\u0090\u00d2\u0005[\u0000\u0000\u0091\u0092\u0005^\u0000"+
		"\u0000\u0092\u0093\u0005/\u0000\u0000\u0093\u00d2\u0005_\u0000\u0000\u0094"+
		"\u0095\u0005\\\u0000\u0000\u0095\u0096\u0005/\u0000\u0000\u0096\u00d2"+
		"\u0005]\u0000\u0000\u0097\u0098\u0005`\u0000\u0000\u0098\u0099\u0005/"+
		"\u0000\u0000\u0099\u00d2\u0005a\u0000\u0000\u009a\u009b\u0005b\u0000\u0000"+
		"\u009b\u009c\u0005/\u0000\u0000\u009c\u00d2\u0005c\u0000\u0000\u009d\u009e"+
		"\u00050\u0000\u0000\u009e\u009f\u0005/\u0000\u0000\u009f\u00d2\u00051"+
		"\u0000\u0000\u00a0\u00a1\u00052\u0000\u0000\u00a1\u00a2\u0005/\u0000\u0000"+
		"\u00a2\u00d2\u00053\u0000\u0000\u00a3\u00a4\u00054\u0000\u0000\u00a4\u00a5"+
		"\u0005/\u0000\u0000\u00a5\u00d2\u00055\u0000\u0000\u00a6\u00a7\u00056"+
		"\u0000\u0000\u00a7\u00a8\u0005/\u0000\u0000\u00a8\u00d2\u00057\u0000\u0000"+
		"\u00a9\u00aa\u00058\u0000\u0000\u00aa\u00ab\u0005/\u0000\u0000\u00ab\u00d2"+
		"\u00059\u0000\u0000\u00ac\u00ad\u0005:\u0000\u0000\u00ad\u00ae\u0005/"+
		"\u0000\u0000\u00ae\u00d2\u0005;\u0000\u0000\u00af\u00b3\u0005>\u0000\u0000"+
		"\u00b0\u00b2\u0005/\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b6\u00d2\u0005?\u0000\u0000\u00b7\u00b8"+
		"\u0005<\u0000\u0000\u00b8\u00d2\u0005=\u0000\u0000\u00b9\u00ba\u0005@"+
		"\u0000\u0000\u00ba\u00bb\u0005/\u0000\u0000\u00bb\u00d2\u0005A\u0000\u0000"+
		"\u00bc\u00bd\u0005B\u0000\u0000\u00bd\u00be\u0005/\u0000\u0000\u00be\u00d2"+
		"\u0005C\u0000\u0000\u00bf\u00c0\u0005F\u0000\u0000\u00c0\u00c1\u0005/"+
		"\u0000\u0000\u00c1\u00d2\u0005G\u0000\u0000\u00c2\u00c3\u0005H\u0000\u0000"+
		"\u00c3\u00c4\u0005/\u0000\u0000\u00c4\u00d2\u0005I\u0000\u0000\u00c5\u00c6"+
		"\u0005J\u0000\u0000\u00c6\u00c7\u0005/\u0000\u0000\u00c7\u00d2\u0005K"+
		"\u0000\u0000\u00c8\u00c9\u0005L\u0000\u0000\u00c9\u00ca\u0005/\u0000\u0000"+
		"\u00ca\u00d2\u0005M\u0000\u0000\u00cb\u00cc\u0005N\u0000\u0000\u00cc\u00cd"+
		"\u0005/\u0000\u0000\u00cd\u00d2\u0005O\u0000\u0000\u00ce\u00cf\u0005D"+
		"\u0000\u0000\u00cf\u00d0\u0005/\u0000\u0000\u00d0\u00d2\u0005E\u0000\u0000"+
		"\u00d1\u007f\u0001\u0000\u0000\u0000\u00d1\u0082\u0001\u0000\u0000\u0000"+
		"\u00d1\u0085\u0001\u0000\u0000\u0000\u00d1\u0088\u0001\u0000\u0000\u0000"+
		"\u00d1\u008b\u0001\u0000\u0000\u0000\u00d1\u008e\u0001\u0000\u0000\u0000"+
		"\u00d1\u0091\u0001\u0000\u0000\u0000\u00d1\u0094\u0001\u0000\u0000\u0000"+
		"\u00d1\u0097\u0001\u0000\u0000\u0000\u00d1\u009a\u0001\u0000\u0000\u0000"+
		"\u00d1\u009d\u0001\u0000\u0000\u0000\u00d1\u00a0\u0001\u0000\u0000\u0000"+
		"\u00d1\u00a3\u0001\u0000\u0000\u0000\u00d1\u00a6\u0001\u0000\u0000\u0000"+
		"\u00d1\u00a9\u0001\u0000\u0000\u0000\u00d1\u00ac\u0001\u0000\u0000\u0000"+
		"\u00d1\u00af\u0001\u0000\u0000\u0000\u00d1\u00b7\u0001\u0000\u0000\u0000"+
		"\u00d1\u00b9\u0001\u0000\u0000\u0000\u00d1\u00bc\u0001\u0000\u0000\u0000"+
		"\u00d1\u00bf\u0001\u0000\u0000\u0000\u00d1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00d1\u00c5\u0001\u0000\u0000\u0000\u00d1\u00c8\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cb\u0001\u0000\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d2\u0017\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005-\u0000\u0000\u00d4"+
		"\u00d6\u0005.\u0000\u0000\u00d5\u00d7\u0003\u0014\n\u0000\u00d6\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0005d\u0000\u0000\u00db\u0019\u0001"+
		"\u0000\u0000\u0000\u00dc\u00de\u0005\u001d\u0000\u0000\u00dd\u00df\u0003"+
		"\u001c\u000e\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005"+
		",\u0000\u0000\u00e3\u001b\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005%\u0000"+
		"\u0000\u00e5\u00e6\u0005\"\u0000\u0000\u00e6\u00e7\u0005#\u0000\u0000"+
		"\u00e7\u0101\u0005$\u0000\u0000\u00e8\u00e9\u0005&\u0000\u0000\u00e9\u00ea"+
		"\u0005\"\u0000\u0000\u00ea\u00eb\u0005#\u0000\u0000\u00eb\u0101\u0005"+
		"$\u0000\u0000\u00ec\u00ed\u0005\'\u0000\u0000\u00ed\u00ee\u0005\"\u0000"+
		"\u0000\u00ee\u00ef\u0005#\u0000\u0000\u00ef\u0101\u0005$\u0000\u0000\u00f0"+
		"\u00f1\u0005(\u0000\u0000\u00f1\u00f2\u0005\"\u0000\u0000\u00f2\u00f3"+
		"\u0005#\u0000\u0000\u00f3\u0101\u0005$\u0000\u0000\u00f4\u00f5\u0005)"+
		"\u0000\u0000\u00f5\u00f6\u0005\"\u0000\u0000\u00f6\u00f7\u0005#\u0000"+
		"\u0000\u00f7\u0101\u0005$\u0000\u0000\u00f8\u00f9\u0005*\u0000\u0000\u00f9"+
		"\u00fa\u0005\"\u0000\u0000\u00fa\u00fb\u0005#\u0000\u0000\u00fb\u0101"+
		"\u0005$\u0000\u0000\u00fc\u00fd\u0005+\u0000\u0000\u00fd\u00fe\u0005\""+
		"\u0000\u0000\u00fe\u00ff\u0005#\u0000\u0000\u00ff\u0101\u0005$\u0000\u0000"+
		"\u0100\u00e4\u0001\u0000\u0000\u0000\u0100\u00e8\u0001\u0000\u0000\u0000"+
		"\u0100\u00ec\u0001\u0000\u0000\u0000\u0100\u00f0\u0001\u0000\u0000\u0000"+
		"\u0100\u00f4\u0001\u0000\u0000\u0000\u0100\u00f8\u0001\u0000\u0000\u0000"+
		"\u0100\u00fc\u0001\u0000\u0000\u0000\u0101\u001d\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0005\u0011\u0000\u0000\u0103\u0105\u0005e\u0000\u0000\u0104"+
		"\u0106\u0003 \u0010\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0005i\u0000\u0000\u010a\u001f\u0001\u0000\u0000\u0000\u010b\u010f\u0003"+
		"\"\u0011\u0000\u010c\u010f\u0003,\u0016\u0000\u010d\u010f\u0003.\u0017"+
		"\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f!\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0005f\u0000\u0000\u0111\u0112\u0005k\u0000\u0000\u0112\u0113"+
		"\u0003$\u0012\u0000\u0113\u0114\u0005l\u0000\u0000\u0114\u0115\u0005r"+
		"\u0000\u0000\u0115#\u0001\u0000\u0000\u0000\u0116\u011b\u0003&\u0013\u0000"+
		"\u0117\u0118\u0005j\u0000\u0000\u0118\u011a\u0003&\u0013\u0000\u0119\u0117"+
		"\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c%\u0001"+
		"\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u011f\u0005"+
		"m\u0000\u0000\u011f\u0120\u0003(\u0014\u0000\u0120\u0121\u0005q\u0000"+
		"\u0000\u0121\'\u0001\u0000\u0000\u0000\u0122\u0127\u0003*\u0015\u0000"+
		"\u0123\u0124\u0005j\u0000\u0000\u0124\u0126\u0003*\u0015\u0000\u0125\u0123"+
		"\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128)\u0001"+
		"\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0005"+
		"n\u0000\u0000\u012b\u012c\u0005p\u0000\u0000\u012c\u012d\u0005o\u0000"+
		"\u0000\u012d\u012e\u0005p\u0000\u0000\u012e+\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0005g\u0000\u0000\u0130-\u0001\u0000\u0000\u0000\u0131\u0132\u0005"+
		"h\u0000\u0000\u0132\u0133\u0005s\u0000\u0000\u0133\u0134\u0005t\u0000"+
		"\u0000\u0134\u0135\u0005u\u0000\u0000\u0135\u0136\u0005v\u0000\u0000\u0136"+
		"\u0137\u0005w\u0000\u0000\u0137/\u0001\u0000\u0000\u0000\u00103AO]lw}"+
		"\u00b3\u00d1\u00d8\u00e0\u0100\u0107\u010e\u011b\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}