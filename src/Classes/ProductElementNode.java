package Classes;

import java.util.List;

public class ProductElementNode extends ASTNode{
    List<ElementArrayNode>elementArrayNodeList;

    public ProductElementNode(int line, int column) {
        super(line, column);
    }

    public List<ElementArrayNode> getElementArrayNodeList() {
        return elementArrayNodeList;
    }

    public void setElementArrayNodeList(List<ElementArrayNode> elementArrayNodeList) {
        this.elementArrayNodeList = elementArrayNodeList;
    }

    @Override
    public String toString() {
        return "ProductElementNode{" +
                "elementArrayNodeList=" + elementArrayNodeList +
                '}';
    }
}
