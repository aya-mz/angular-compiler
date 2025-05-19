package AST;

import Classes.*;

import java.util.List;

public class PrintAST {

    public void printApp(AppNode app) {
        System.out.println("App:");

        if (app.getImportNodeList() != null && !app.getImportNodeList().isEmpty()) {
            System.out.println("  Imports:");
            for (ImportNode importNode : app.getImportNodeList()) {
                printImport(importNode, "    ");
            }
        }

        if (app.getComponentNode() != null) {
            System.out.println("  Component:");
            printComponent(app.getComponentNode(), "    ");
        }

        if (app.getAppComponentNode() != null) {
            System.out.println("  AppComponent:");
            printAppComponent(app.getAppComponentNode(), "    ");
        }
    }

    public void printImport(ImportNode importNode, String indent) {
        System.out.println(indent + "Import:");
        System.out.println(indent + "  ImportStatement:");
        printImportStatement(importNode.getImportStatementNode(), indent + "    ");
        System.out.println(indent + "  From: " + importNode.getImportedFromNode().getSTRING_LITERAL());
    }

    public void printImportStatement(ImportStatementNode importStatement, String indent) {
        for (ImportedSymbolNode symbol : importStatement.getImportedSymbolNode()) {
            System.out.println(indent + "  Symbol: " + symbol.getMODULE_NAME());
        }
    }

    public void printComponent(ComponentNode component, String indent) {
        System.out.println(indent + "Component_OPEN");

        if (component.getComponentBodyNode() != null) {
            System.out.println(indent + "  ComponentBody:");
            printComponentBody(component.getComponentBodyNode(), indent + "    ");
        }

        System.out.println(indent + "Component_CLOSE");
    }

    public void printComponentBody(ComponentBodyNode body, String indent) {
        for (ComponentEntryNode entry : body.getComponentEntryNodeList()) {
            if (entry instanceof SelectorDataNode) {
                System.out.println(indent + "  Selector:");
                System.out.println(indent + "    " + ((SelectorDataNode) entry).getSELECTOR_BODY());
            } else if (entry instanceof StandaloneDataNode) {
                System.out.println(indent + "  Standalone:");
                System.out.println(indent + "    " + ((StandaloneDataNode) entry).getSTANDALONE_VALUE());
            } else if (entry instanceof ImportsDataNode) {
                System.out.println(indent + "  ImportsData:");
                System.out.println(indent + "    " + ((ImportsDataNode) entry).getSELECTOR_BODY());
            } else if (entry instanceof TemplateNode) {
                System.out.println(indent + "  Template:");
                printTemplate((TemplateNode) entry, indent + "    ");
            } else if (entry instanceof StylesNode) {
                System.out.println(indent + "  Styles:");
                printStyles((StylesNode) entry, indent + "    ");
            }
        }
    }

    public void printTemplate(TemplateNode template, String indent) {
        System.out.println(indent + "TEMPLATE_OPEN");

        if (template.getTemplateBodyNode() != null) {
            System.out.println(indent + "  TemplateBody:");
            printTemplateBody(template.getTemplateBodyNode(), indent + "    ");
        }

        System.out.println(indent + "TEMPLATE_CLOSE");
    }

    public void printTemplateBody(TemplateBodyNode body, String indent) {
        if (body.getDivBodyNodeList() != null && !body.getDivBodyNodeList().isEmpty()) {
            System.out.println(indent + "OPEN_DIV:");
            System.out.println(indent + "  IN_DIV: " + body.getIN_DIV());
            System.out.println(indent + "DivBody:");
            for (DivBodyNode div : body.getDivBodyNodeList()) {
                printDiv(div, indent);
            }
            System.out.println(indent + "CLOSE_DIV:");
        }
    }


    public void printDiv(DivBodyNode div, String indent) {
        if (div instanceof DivNode) {
            DivNode actualDiv = (DivNode) div;
            System.out.println(indent + "OPEN_DIV:");
            System.out.println(indent + "  IN_DIV: " + actualDiv.getIN_DIV());
            if (actualDiv.getDivBodyNodeList() != null && !actualDiv.getDivBodyNodeList().isEmpty()) {
                System.out.println(indent + "DivBody:");
                for (DivBodyNode innerNode : actualDiv.getDivBodyNodeList()) {
                    if (innerNode instanceof DivNode) {
                        printDiv(innerNode, indent + "  ");
                    } else if (innerNode instanceof HtmlElementNode) {
                        HtmlElementNode element = (HtmlElementNode) innerNode;

                        if (element instanceof H1Node) {
                            System.out.println(indent + "  H1: " + ((H1Node) element).getTAG_VALUE());
                        } else if (element instanceof H2Node) {
                            System.out.println(indent + "  H2: " + ((H2Node) element).getTAG_VALUE());
                        } else if (element instanceof H3Node) {
                            System.out.println(indent + "  H3: " + ((H3Node) element).getTAG_VALUE());
                        } else if (element instanceof H4Node) {
                            System.out.println(indent + "  H4: " + ((H4Node) element).getTAG_VALUE());
                        } else if (element instanceof H5Node) {
                            System.out.println(indent + "  H5: " + ((H5Node) element).getTAG_VALUE());
                        } else if (element instanceof H6Node) {
                            System.out.println(indent + "  H6: " + ((H6Node) element).getTAG_VALUE());
                        } else if (element instanceof PNode) {
                            System.out.println(indent + "  P: " + ((PNode) element).getTAG_VALUE());
                        } else if (element instanceof HeaderNode) {
                            System.out.println(indent + "  Header: " + ((HeaderNode) element).getTAG_VALUE());
                        } else if (element instanceof SectionNode) {
                            System.out.println(indent + "  Section: " + ((SectionNode) element).getTAG_VALUE());
                        } else if (element instanceof ArticleNode) {
                            System.out.println(indent + "  Article: " + ((ArticleNode) element).getTAG_VALUE());
                        } else if (element instanceof AsideNode) {
                            System.out.println(indent + "  Aside: " + ((AsideNode) element).getTAG_VALUE());
                        } else if (element instanceof DetailsNode) {
                            System.out.println(indent + "  Details: " + ((DetailsNode) element).getTAG_VALUE());
                        } else if (element instanceof ANode) {
                            System.out.println(indent + "  A: " + ((ANode) element).getTAG_VALUE());
                        } else if (element instanceof OlNode) {
                            System.out.println(indent + "  Ol: " + ((OlNode) element).getTAG_VALUE());
                        } else if (element instanceof UlNode) {
                            System.out.println(indent + "  Ul: " + ((UlNode) element).getTAG_VALUE());
                        } else if (element instanceof LiNode) {
                            System.out.println(indent + "  Li: " + ((LiNode) element).getTAG_VALUE());
                        } else if (element instanceof NavNode) {
                            System.out.println(indent + "  Nav: " + ((NavNode) element).getTAG_VALUE());
                        } else if (element instanceof ImgNode) {
                            System.out.println(indent + "  Img: " + ((ImgNode) element).getIMG_Open());
                        } else if (element instanceof SpanNode) {
                            System.out.println(indent + "  Span: " + ((SpanNode) element).getTAG_VALUE());
                        } else if (element instanceof StrongNode) {
                            System.out.println(indent + "  Strong: " + ((StrongNode) element).getTAG_VALUE());
                        } else if (element instanceof INode) {
                            System.out.println(indent + "  I: " + ((INode) element).getTAG_VALUE());
                        } else if (element instanceof UNode) {
                            System.out.println(indent + "  U: " + ((UNode) element).getTAG_VALUE());
                        } else if (element instanceof BNode) {
                            System.out.println(indent + "  B: " + ((BNode) element).getTAG_VALUE());
                        } else if (element instanceof SmallNode) {
                            System.out.println(indent + "  Small: " + ((SmallNode) element).getTAG_VALUE());
                        } else if (element instanceof MarkNode) {
                            System.out.println(indent + "  Mark: " + ((MarkNode) element).getTAG_VALUE());
                        } else if (element instanceof EmNode) {
                            System.out.println(indent + "  Em: " + ((EmNode) element).getTAG_VALUE());
                        } else {
                            System.out.println(indent + "  Unknown HtmlElementNode: " + element.getClass().getSimpleName());
                        }
                    } else {
                        System.out.println(indent + "  Unknown DivBodyNode: " + innerNode.getClass().getSimpleName());
                    }
                }
            }

            System.out.println(indent + "CLOSE_DIV");
        }
    }


    public void printStyles(StylesNode styles, String indent) {
        System.out.println(indent + "STYLES_OPEN");

        if (styles.getStylesBodyNodeList() != null && !styles.getStylesBodyNodeList().isEmpty()) {
            System.out.println(indent + "  StylesBody:");
            for (StylesBodyNode styleBody : styles.getStylesBodyNodeList()) {
                if (styleBody instanceof P_appNode) {
                    System.out.println(indent + "    P_app: " + ((P_appNode) styleBody).getCSS_BODY());
                } else if (styleBody instanceof P_listNode) {
                    System.out.println(indent + "    P_list: " + ((P_listNode) styleBody).getCSS_BODY());
                } else if (styleBody instanceof P_cardNode) {
                    System.out.println(indent + "    P_card: " + ((P_cardNode) styleBody).getCSS_BODY());
                } else if (styleBody instanceof P_card_hNode) {
                    System.out.println(indent + "    P_card_h: " + ((P_card_hNode) styleBody).getCSS_BODY());
                } else if (styleBody instanceof P_card_iNode) {
                    System.out.println(indent + "    P_card_i: " + ((P_card_iNode) styleBody).getCSS_BODY());
                } else if (styleBody instanceof P_detailNode) {
                    System.out.println(indent + "    P_detail: " + ((P_detailNode) styleBody).getCSS_BODY());
                } else if (styleBody instanceof P_detail_iNode) {
                    System.out.println(indent + "    P_detail_i: " + ((P_detail_iNode) styleBody).getCSS_BODY());
                } else {
                    System.out.println(indent + "    Unknown Style: " + styleBody.getClass().getSimpleName());
                }
            }
        }

        System.out.println(indent + "STYLES_CLOSE");
    }

    public void printAppComponent(AppComponentNode appComponent, String indent) {
        System.out.println(indent + "APPComponent_OPEN");

        if (appComponent.getAppComponentBodyNodeList() != null && !appComponent.getAppComponentBodyNodeList().isEmpty()) {
            System.out.println(indent + "  AppComponentBody:");
            for (AppComponentBodyNode bodyNode : appComponent.getAppComponentBodyNodeList()) {
                if (bodyNode instanceof ProductsNode) {
                    System.out.println(indent + "    Products:");
                    printProducts((ProductsNode) bodyNode, indent + "      ");
                } else if (bodyNode instanceof SelectedProductNode) {
                    System.out.println();
                    System.out.println(indent + "    SelectedProduct: " );
                    System.out.println(indent +"        "+((SelectedProductNode) bodyNode).getSelectedProduct());
                } else if (bodyNode instanceof ClickNode) {
                    System.out.println(indent + "    Click:");
                    printClick((ClickNode) bodyNode, indent + "      ");
                }
            }
        }

        System.out.println(indent + "APPComponent_CLOSE");
    }

    public void printProducts(ProductsNode node, String indent) {
        System.out.println(indent + "Products:");

        if (node.getProductElementNode() != null) {
            System.out.println(indent + "  ProductElement:");

            List<ElementArrayNode> elementArrayList = node.getProductElementNode().getElementArrayNodeList();
            if (elementArrayList != null) {
                for (ElementArrayNode arrayNode : elementArrayList) {
                    System.out.println(indent + "    ElementArray:");

                    ElementBodyNode bodyNode = arrayNode.getElementBodyNode();
                    if (bodyNode != null) {
                        System.out.println(indent + "      ElementBody:");

                        List<ElementNameNode> names = bodyNode.getElementNameNodeList();
                        if (names != null) {
                            for (ElementNameNode nameNode : names) {
                                System.out.println(indent + "        Element Name: " + nameNode.getElement_name());
                                System.out.println(indent + "        Element Value: " + nameNode.getElement_value());
                            }
                        }
                    }
                }
            }
        }
    }

    public void printClick(ClickNode click, String indent) {
        System.out.println(indent + "  OnProductClick: " + click.getProductClick_Attribute());
        System.out.println(indent + "  ProductClick_body: " + click.getProductClick_body());
    }
}
