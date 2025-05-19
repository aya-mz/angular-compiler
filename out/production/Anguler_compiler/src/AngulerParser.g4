parser grammar AngulerParser;

options {tokenVocab=AngulerLexer;}

app:imporT+ component appComponent ;

imporT:importStatement importFrom SEMI;
importStatement:IMPORT IMPORT_LRACE importedSymbols+ IMPORT_RRACE ;
importFrom:FROM DOUBLE_QUOT STRING_LITERAL DOUBLE_QUOT ;
importedSymbols: MODULE_NAME (COMMA MODULE_NAME)*;

component:Component_OPEN Component_OPEN_RACE component_body Component_CLOSE_RACE Component_CLOSE;
component_body:component_entry(Component_COMMA component_entry)*;
component_entry: SELECTOR SELECTOR_QUOT SELECTOR_BODY SELECTOR_QUOT     #selector_data
                | STANDALONE STANDALONE_VALUE                           #standalone_data
                | IMPORTS IMPORTS_LRACE SELECTOR_BODY IMPORTS_RRACE     #imports_data
                | template                                              #template_data
                | styles                                                #styles_data
                ;
template:TEMPLATE_OPEN template_body Template_Close;
template_body:OPEN_DIV IN_DIV div_body+ CLOSE_DIV;
div_body: div               #div_data
         |html_element      #html_element_data
         ;
html_element: HEADER_Open TAG_VALUE HEADER_Close      #header
             |SECTION_Open TAG_VALUE SECTION_Close    #section
             |ARTICLE_Open TAG_VALUE ARTICLE_Close    #article
             |ASIDE_Open TAG_VALUE ASIDE_Close        #aside
             |DETAILS_Open TAG_VALUE DETAILS_Close    #details
             |A_Open TAG_VALUE A_Close                #a
             |OL_Open TAG_VALUE OL_Close              #ol
             |UL_Open TAG_VALUE UL_Close              #ul
             |LI_Open TAG_VALUE LI_Close              #li
             |NAV_Open TAG_VALUE NAV_Close            #nav
             |H1_Open TAG_VALUE H1_Close              #h1
             |H2_Open TAG_VALUE H2_Close              #h2
             |H3_Open TAG_VALUE H3_Close              #h3
             |H4_Open TAG_VALUE H4_Close              #h4
             |H5_Open TAG_VALUE H5_Close              #h5
             |H6_Open TAG_VALUE H6_Close              #h6
             |P_Open TAG_VALUE* P_Close               #p
             |IMG_Open IMG_Close                      #img
             |SPAN_Open TAG_VALUE SPAN_Close          #span
             |STRONG_Open TAG_VALUE STRONG_Close      #strong
             |I_Open TAG_VALUE I_Close                #i
             |U_Open TAG_VALUE U_Close                #u
             |B_Open TAG_VALUE B_Close                #b
             |SMALL_Open TAG_VALUE SMALL_Close        #small
             |MARK_Open TAG_VALUE MARK_Close          #mark
             |EM_Open TAG_VALUE EM_Close              #em
             ;
div:OPEN_NEW_DIV IN_DIV div_body+ CLOSE_DIV;

styles:STYLES_OPEN styles_body+ STYLES_CLOSE;
styles_body: P_app Styles_Lrace CSS_BODY Styles_Rrace           #p_app
            |P_list Styles_Lrace CSS_BODY Styles_Rrace          #p_list
            |P_card Styles_Lrace CSS_BODY Styles_Rrace          #p_card
            |P_card_h Styles_Lrace CSS_BODY Styles_Rrace        #p_card_h
            |P_card_i Styles_Lrace CSS_BODY Styles_Rrace        #p_card_i
            |P_detail Styles_Lrace CSS_BODY Styles_Rrace        #p_detail
            |P_detail_i Styles_Lrace CSS_BODY Styles_Rrace      #p_detail_i
            ;

appComponent:APPComponent_OPEN APPComponent_RACE_OPEN appComponent_body+ APPComponent_RACE_CLOSE;
appComponent_body: products             #products_data
                  |selectedProduct      #selectedProduct_data
                  |click                #click_data
                  ;
products:Array_Product_OPEN Array_Product_RACE_OPEN productElement Array_Product_RACE_CLOSE Array_Product_SEMI;
productElement:element_Array (Array_COMMA element_Array)*;
element_Array:Array_element_Open element_body Array_element_Close;
element_body:element_name (Array_COMMA element_name)*;
element_name:Element_name Element_quot Element_value Element_quot;

selectedProduct:SelectedProduct;

click:OnProductClick ProductClick_Attribute ProductClick_Open ProductClick_body ProductClick_SEMI ProductClick_Close;
