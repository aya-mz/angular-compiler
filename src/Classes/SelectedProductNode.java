package Classes;

public class SelectedProductNode extends AppComponentBodyNode{
    String SelectedProduct;

    public SelectedProductNode(int line, int column) {
        super(line, column);
    }

    public String getSelectedProduct() {
        return SelectedProduct;
    }

    public void setSelectedProduct(String selectedProduct) {
        SelectedProduct = selectedProduct;
    }

    @Override
    public String toString() {
        return "SelectedProductNode{" +
                "SelectedProduct='" + SelectedProduct + '\'' +
                '}';
    }
}
