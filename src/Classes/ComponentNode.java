package Classes;

public class ComponentNode extends ASTNode{
    ComponentBodyNode componentBodyNode;

    public ComponentNode(int line, int column) {
        super(line, column);
    }

    public ComponentBodyNode getComponentBodyNode() {
        return componentBodyNode;
    }

    public void setComponentBodyNode(ComponentBodyNode componentBodyNode) {
        this.componentBodyNode = componentBodyNode;
    }

    @Override
    public String toString() {
        return "ComponentNode{" +
                "componentBodyNode=" + componentBodyNode +
                '}';
    }
}
