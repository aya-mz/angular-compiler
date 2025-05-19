package Classes;

import java.util.List;

public class TemplateBodyNode extends ASTNode{
    String IN_DIV;
    List<DivBodyNode>divBodyNodeList;

    public TemplateBodyNode(int line, int column) {
        super(line, column);
    }

    public List<DivBodyNode> getDivBodyNodeList() {
        return divBodyNodeList;
    }

    public void setDivBodyNodeList(List<DivBodyNode> divBodyNodeList) {
        this.divBodyNodeList = divBodyNodeList;
    }

    public String getIN_DIV() {
        return IN_DIV;
    }

    public void setIN_DIV(String IN_DIV) {
        this.IN_DIV = IN_DIV;
    }

    @Override
    public String toString() {
        return "TemplateBodyNode{" +
                "divBodyNodeList=" + divBodyNodeList +
                '}';
    }
}
