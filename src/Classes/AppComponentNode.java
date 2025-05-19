package Classes;

import java.util.List;

public class AppComponentNode extends ASTNode{
    List<AppComponentBodyNode>appComponentBodyNodeList;

    public AppComponentNode(int line, int column) {
        super(line, column);
    }

    public List<AppComponentBodyNode> getAppComponentBodyNodeList() {
        return appComponentBodyNodeList;
    }

    public void setAppComponentBodyNodeList(List<AppComponentBodyNode> appComponentBodyNodeList) {
        this.appComponentBodyNodeList = appComponentBodyNodeList;
    }

    @Override
    public String toString() {
        return "AppComponentNode{" +
                "appComponentBodyNodeList=" + appComponentBodyNodeList +
                '}';
    }
}
