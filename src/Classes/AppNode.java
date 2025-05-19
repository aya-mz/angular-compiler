package Classes;

import java.util.List;

public class AppNode extends ASTNode{
    List<ImportNode>importNodeList;
    AppComponentNode appComponentNode;
    ComponentNode componentNode;

    public AppNode(int line, int column){
        super(line, column);
    }

    public List<ImportNode> getImportNodeList() {
        return importNodeList;
    }

    public void setImportNodeList(List<ImportNode> importNodeList) {
        this.importNodeList = importNodeList;
    }

    public AppComponentNode getAppComponentNode() {
        return appComponentNode;
    }

    public void setAppComponentNode(AppComponentNode appComponentNode) {
        this.appComponentNode = appComponentNode;
    }

    public ComponentNode getComponentNode() {
        return componentNode;
    }

    public void setComponentNode(ComponentNode componentNode) {
        this.componentNode = componentNode;
    }

    @Override
    public String toString() {
        return "AppNode{" + '\n' +
                "importNodeList=" + importNodeList +
                ",'\n' appComponentNode=" + appComponentNode +
                ",'\n' componentNode=" + componentNode +
                ", " + super.toString() +
                '}';
    }
}
