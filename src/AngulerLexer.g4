lexer grammar AngulerLexer;

COMMA:',';
DOUBLE_QUOT:'"';
BOOLEAN:'true'|'false';
LARACE:'[';
RARACE:']';
LBRACE:'{';
RBRACE:'}';
SEMI:';';
WORD_VALUE:[a-zA-Z_]+;
STRING_LITERAL: [a-zA-Z0-9_/@.-]+;

IMPORT:WhiteSpace*'import'WhiteSpace*;
FROM:WhiteSpace*'from'WhiteSpace*;
IMPORT_LRACE:WhiteSpace* LBRACE WhiteSpace*;
MODULE_NAME:WhiteSpace*[a-zA-Z_][a-zA-Z0-9_]*WhiteSpace*;
IMPORT_RRACE:WhiteSpace* RBRACE WhiteSpace*;

Component_OPEN:WhiteSpace*'@Component(' WhiteSpace*->pushMode(Component);
APPComponent_OPEN:WhiteSpace*'export'WhiteSpace'class'WhiteSpace WORD_VALUE WhiteSpace*->pushMode(CLASS);

mode Component;
Component_COMMA:COMMA;
Component_OPEN_RACE:WhiteSpace* LBRACE WhiteSpace*;
SELECTOR:WhiteSpace*'selector'WhiteSpace*':';
SELECTOR_QUOT:WhiteSpace* DOUBLE_QUOT WhiteSpace*;
SELECTOR_BODY:[a-zA-Z_-]+WhiteSpace*;
STANDALONE:WhiteSpace*'standalone'WhiteSpace*':';
STANDALONE_VALUE:WhiteSpace*BOOLEAN WhiteSpace*;
IMPORTS:WhiteSpace*'imports'WhiteSpace*':';
IMPORTS_LRACE:WhiteSpace*LARACE WhiteSpace*;
IMPORTS_RRACE:WhiteSpace* RARACE WhiteSpace*;
TEMPLATE_OPEN:WhiteSpace*'template'WhiteSpace*':'WhiteSpace*'`'->pushMode(Template);
STYLES_OPEN:WhiteSpace*'styles'WhiteSpace*':'WhiteSpace* LARACE WhiteSpace* '`'->pushMode(Styles);
Component_CLOSE_RACE:WhiteSpace* RBRACE WhiteSpace*;
Component_CLOSE:WhiteSpace*')'WhiteSpace*->popMode;

mode Template;
OPEN_DIV:WhiteSpace*'<div'->pushMode(Div);
Template_Close:'`'WhiteSpace*->popMode;

mode Styles;
Styles_Lrace:WhiteSpace* LBRACE WhiteSpace*;
CSS_BODY:WhiteSpace*
       (
        WhiteSpace*'display'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'border'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'width'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'max-width'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'align-items'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'flex-direction'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'height'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'gap'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'margin'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'flex'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'flex-wrap'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'justify-content'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'border-right'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'border-left'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'padding'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'overflow-y'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'text-align'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'cursor'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'transition'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'background-color'WhiteSpace*':'WhiteSpace*Space+WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'object-fit'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'margin-bottom'WhiteSpace*':'WhiteSpace*Space+ WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'flex-grow'WhiteSpace*':'WhiteSpace*Space+WhiteSpace*';'WhiteSpace*
       |
        WhiteSpace*'margin-top'WhiteSpace*':'WhiteSpace*Space+WhiteSpace*';'WhiteSpace*
       )+;
Styles_Rrace:WhiteSpace* RBRACE WhiteSpace*;
P_app: WhiteSpace*'.app'WhiteSpace*;
P_list: WhiteSpace*'.product-list'WhiteSpace*;
P_card: WhiteSpace*'.product-card'WhiteSpace*;
P_card_h: WhiteSpace*'.product-card:hover'WhiteSpace*;
P_card_i: WhiteSpace*'.product-card img'WhiteSpace*;
P_detail: WhiteSpace*'.product-details'WhiteSpace*;
P_detail_i: WhiteSpace*'.product-details img'WhiteSpace*;

STYLES_CLOSE:WhiteSpace*'`'WhiteSpace*RARACE->popMode;

mode Div;
OPEN_NEW_DIV:WhiteSpace*'<div'->pushMode(Div);
IN_DIV: WhiteSpace*
        (
          (WhiteSpace*'class'WhiteSpace*'='WhiteSpace*DOUBLE_QUOT WhiteSpace*Space WhiteSpace*DOUBLE_QUOT WhiteSpace*)
        |
          (WhiteSpace*'*ngFor'WhiteSpace*'='WhiteSpace*DOUBLE_QUOT WhiteSpace*'let'WhiteSpace*Space WhiteSpace*'of'WhiteSpace*Space WhiteSpace*DOUBLE_QUOT WhiteSpace*)
        |
          (WhiteSpace*'*ngIf'WhiteSpace*'='WhiteSpace*DOUBLE_QUOT WhiteSpace* WORD_VALUE WhiteSpace*DOUBLE_QUOT WhiteSpace*)
        |
          (WhiteSpace*'(click)'WhiteSpace*'='WhiteSpace*DOUBLE_QUOT WhiteSpace* WORD_VALUE WhiteSpace*'('WhiteSpace*Space WhiteSpace*')'WhiteSpace*DOUBLE_QUOT WhiteSpace*)
        )*
        '>' WhiteSpace*;
TAG_VALUE:WhiteSpace* Space WhiteSpace*;
H1_Open:WhiteSpace*'<h1>'WhiteSpace*;
H1_Close:WhiteSpace*'</h1>'WhiteSpace*;
H2_Open:WhiteSpace*'<h2>'WhiteSpace*;
H2_Close:WhiteSpace*'</h2>'WhiteSpace*;
H3_Open:WhiteSpace*'<h3>'WhiteSpace*;
H3_Close:WhiteSpace*'</h3>'WhiteSpace*;
H4_Open:WhiteSpace*'<h4>'WhiteSpace*;
H4_Close:WhiteSpace*'</h4>'WhiteSpace*;
H5_Open:WhiteSpace*'<h5>'WhiteSpace*;
H5_Close:WhiteSpace*'</h5>'WhiteSpace*;
H6_Open:WhiteSpace*'<h6>'WhiteSpace*;
H6_Close:WhiteSpace*'</h6>'WhiteSpace*;
IMG_Open: WhiteSpace*'<'WhiteSpace*'img'WhiteSpace*
     '[src]'WhiteSpace*'='WhiteSpace*'"'WhiteSpace*Space'.'WhiteSpace*'image'WhiteSpace*'"'WhiteSpace*
     (
        (
          WhiteSpace*'alt'WhiteSpace*'='WhiteSpace*'"'WhiteSpace*Space+WhiteSpace*'"'WhiteSpace*
        )|
        (
          WhiteSpace*'class'WhiteSpace*'='WhiteSpace*'"'WhiteSpace*Space+WhiteSpace*'"'WhiteSpace*
        )
     )*;
IMG_Close:WhiteSpace* '/>' WhiteSpace*;
P_Open:WhiteSpace*'<p>'WhiteSpace*;
P_Close:WhiteSpace*'</p>'WhiteSpace*;
SPAN_Open:WhiteSpace*'<span>'WhiteSpace*;
SPAN_Close:WhiteSpace*'</span>'WhiteSpace*;
STRONG_Open:WhiteSpace*'<strong>'WhiteSpace*;
STRONG_Close:WhiteSpace*'</strong>'WhiteSpace*;
EM_Open:WhiteSpace*'<em>'WhiteSpace*;
EM_Close:WhiteSpace*'</em>'WhiteSpace*;
I_Open:WhiteSpace*'<i>'WhiteSpace*;
I_Close:WhiteSpace*'</i>'WhiteSpace*;
U_Open:WhiteSpace*'<u>'WhiteSpace*;
U_Close:WhiteSpace*'</u>'WhiteSpace*;
B_Open:WhiteSpace*'<b>'WhiteSpace*;
B_Close:WhiteSpace*'</b>'WhiteSpace*;
SMALL_Open:WhiteSpace*'<small>'WhiteSpace*;
SMALL_Close:WhiteSpace*'</small>'WhiteSpace*;
MARK_Open:WhiteSpace*'<mark>'WhiteSpace*;
MARK_Close:WhiteSpace*'</mark>'WhiteSpace*;
HEADER_Open:WhiteSpace*'<header>'WhiteSpace*;
HEADER_Close:WhiteSpace*'</header>'WhiteSpace*;
SECTION_Open:WhiteSpace*'<section>'WhiteSpace*;
SECTION_Close:WhiteSpace*'</section>'WhiteSpace*;
ARTICLE_Open:WhiteSpace*'<article>'WhiteSpace*;
ARTICLE_Close:WhiteSpace*'</article>'WhiteSpace*;
ASIDE_Open:WhiteSpace*'<aside>'WhiteSpace*;
ASIDE_Close:WhiteSpace*'</aside>'WhiteSpace*;
DETAILS_Open:WhiteSpace*'<details>'WhiteSpace*;
DETAILS_Close:WhiteSpace*'</details>'WhiteSpace*;
A_Open:WhiteSpace*'<a>'WhiteSpace*;
A_Close:WhiteSpace*'</a>'WhiteSpace*;
UL_Open:WhiteSpace*'<ul>'WhiteSpace*;
UL_Close:WhiteSpace*'</ul>'WhiteSpace*;
OL_Open:WhiteSpace*'<ol>'WhiteSpace*;
OL_Close:WhiteSpace*'</ol>'WhiteSpace*;
LI_Open:WhiteSpace*'<li>'WhiteSpace*;
LI_Close:WhiteSpace*'</li>'WhiteSpace*;
NAV_Open:WhiteSpace*'<nav>'WhiteSpace*;
NAV_Close:WhiteSpace*'</nav>'WhiteSpace*;
CLOSE_DIV:WhiteSpace*'</div>'WhiteSpace*->popMode;

mode CLASS;
APPComponent_RACE_OPEN:WhiteSpace* LBRACE WhiteSpace*;
Array_Product_OPEN:WhiteSpace*WORD_VALUE WhiteSpace*'='WhiteSpace*->pushMode(Array_Product);
SelectedProduct:WhiteSpace*WORD_VALUE WhiteSpace*':'WhiteSpace*[a-zA-Z]+ WhiteSpace*'='WhiteSpace*[a-zA-Z]+WhiteSpace*';'WhiteSpace*;
OnProductClick:WhiteSpace*WORD_VALUE WhiteSpace*'('WhiteSpace*->pushMode(ProductClick);
APPComponent_RACE_CLOSE:WhiteSpace* RBRACE WhiteSpace*->popMode;

mode Array_Product;
Array_COMMA:WhiteSpace*COMMA WhiteSpace*;
Array_Product_RACE_OPEN:WhiteSpace*LARACE WhiteSpace*;
Array_Product_RACE_CLOSE:WhiteSpace*RARACE WhiteSpace*;

Array_element_Open:WhiteSpace*LBRACE WhiteSpace*;
Element_name:WhiteSpace*WORD_VALUE WhiteSpace*':'WhiteSpace*;
Element_value:WhiteSpace* Elment_value_AB+ WhiteSpace*;
Element_quot:WhiteSpace* DOUBLE_QUOT WhiteSpace*;
Array_element_Close:WhiteSpace* RBRACE WhiteSpace*;

Array_Product_SEMI:WhiteSpace* SEMI WhiteSpace*->popMode;

mode ProductClick;
ProductClick_Attribute:WhiteSpace*[a-zA-Z]+WhiteSpace*':'WhiteSpace*[a-zA-Z]+WhiteSpace*')'WhiteSpace*;
ProductClick_Open:WhiteSpace*LBRACE WhiteSpace*;
ProductClick_body:WhiteSpace*'this.'WORD_VALUE WhiteSpace*'='WhiteSpace*[a-zA-Z]+WhiteSpace*;
ProductClick_SEMI:WhiteSpace*SEMI WhiteSpace*;
ProductClick_Close:WhiteSpace*RBRACE->popMode;



fragment
WhiteSpace:('\t'| '\n'| '\r'|' ')->skip;
Space:(' '|'.'|[0-9]|[a-zA-Z]|'{'|'}'|'-'|'_'|'#'|'%'|'/'|':'|'$')+;
Elment_value_AB:(' '|'.'|[0-9]|[a-zA-Z]|'-'|'_'|'#'|'%'|'/'|':'|'$')+;
