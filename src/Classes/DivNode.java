package Classes;

import java.util.List;

public class DivNode extends DivBodyNode{
    String IN_DIV;
    List<DivBodyNode>divBodyNodeList;

    public DivNode(int line, int column, String IN_DIV) {
        super(line, column);
        this.IN_DIV=IN_DIV;
    }

    public String getIN_DIV() {
        return IN_DIV;
    }

    public void setIN_DIV(String IN_DIV) {
        this.IN_DIV = IN_DIV;
    }

    public List<DivBodyNode> getDivBodyNodeList() {
        return divBodyNodeList;
    }

    public void setDivBodyNodeList(List<DivBodyNode> divBodyNodeList) {
        this.divBodyNodeList = divBodyNodeList;
    }

    @Override
    public String toString() {
        return "DivNode{" +
                "IN_DIV='" + IN_DIV + '\'' +
                ", divBodyNodeList=" + divBodyNodeList +
                '}';
    }
}
