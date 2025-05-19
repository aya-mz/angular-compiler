package Classes;

public class ClickNode extends AppComponentBodyNode{
    String ProductClick_Attribute, ProductClick_body;

    public ClickNode(int line, int column) {
        super(line, column);
    }

    public String getProductClick_Attribute() {
        return ProductClick_Attribute;
    }

    public void setProductClick_Attribute(String productClick_Attribute) {
        ProductClick_Attribute = productClick_Attribute;
    }

    public String getProductClick_body() {
        return ProductClick_body;
    }

    public void setProductClick_body(String productClick_body) {
        ProductClick_body = productClick_body;
    }

    @Override
    public String toString() {
        return "ClickNode{" +
                "ProductClick_Attribute='" + ProductClick_Attribute + '\'' +
                ", ProductClick_body='" + ProductClick_body + '\'' +
                '}';
    }
}
