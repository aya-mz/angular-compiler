package Classes;

public class ElementArrayNode extends ASTNode{
    ElementBodyNode elementBodyNode;

    public ElementArrayNode(int line, int column) {
        super(line, column);
    }

    public ElementBodyNode getElementBodyNode() {
        return elementBodyNode;
    }

    public void setElementBodyNode(ElementBodyNode elementBodyNode) {
        this.elementBodyNode = elementBodyNode;
    }

    @Override
    public String toString() {
        return "ElementArrayNode{" +
                "elementBodyNode=" + elementBodyNode +
                '}';
    }
}
