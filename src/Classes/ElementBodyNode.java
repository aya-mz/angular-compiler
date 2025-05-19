package Classes;

import java.util.List;

public class ElementBodyNode extends ASTNode{
    List<ElementNameNode>elementNameNodeList;

    public ElementBodyNode(int line, int column) {
        super(line, column);
    }

    public List<ElementNameNode> getElementNameNodeList() {
        return elementNameNodeList;
    }

    public void setElementNameNodeList(List<ElementNameNode> elementNameNodeList) {
        this.elementNameNodeList = elementNameNodeList;
    }

    @Override
    public String toString() {
        return "ElementBodyNode{" +
                "elementNameNodeList=" + elementNameNodeList +
                '}';
    }
}
