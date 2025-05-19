package Classes;

public class ProductsNode extends AppComponentBodyNode{
    ProductElementNode productElementNode;

    public ProductsNode(int line, int column) {
        super(line, column);
    }

    public ProductElementNode getProductElementNode() {
        return productElementNode;
    }

    public void setProductElementNode(ProductElementNode productElementNode) {
        this.productElementNode = productElementNode;
    }

    @Override
    public String toString() {
        return "ProductsNode{" +
                "productElementNode=" + productElementNode +
                '}';
    }
}
