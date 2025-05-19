package Classes;

import java.util.List;

public class ComponentBodyNode extends ASTNode{
    List<ComponentEntryNode>componentEntryNodeList;

    public ComponentBodyNode(int line, int column) {
        super(line, column);
    }

    public List<ComponentEntryNode> getComponentEntryNodeList() {
        return componentEntryNodeList;
    }

    public void setComponentEntryNodeList(List<ComponentEntryNode> componentEntryNodeList) {
        this.componentEntryNodeList = componentEntryNodeList;
    }

    @Override
    public String toString() {
        return "ComponentBodyNode{" +
                "componentEntryNodeList=" + componentEntryNodeList +
                '}';
    }
}
