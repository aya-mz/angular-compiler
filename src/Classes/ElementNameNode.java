package Classes;

public class ElementNameNode extends ASTNode{
    String Element_name, Element_value;

    public ElementNameNode(int line, int column) {
        super(line, column);
    }

    public String getElement_name() {
        return Element_name;
    }

    public void setElement_name(String element_name) {
        Element_name = element_name;
    }

    public String getElement_value() {
        return Element_value;
    }

    public void setElement_value(String element_value) {
        Element_value = element_value;
    }

    @Override
    public String toString() {
        return "ElementNameNode{" +
                "Element_name='" + Element_name + '\'' +
                ", Element_value='" + Element_value + '\'' +
                '}';
    }
}
