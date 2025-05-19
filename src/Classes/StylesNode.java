package Classes;

import java.util.List;

public class StylesNode extends ComponentEntryNode{
    List<StylesBodyNode>stylesBodyNodeList;
    public StylesNode(int line, int column) {
        super(line, column);
    }

    public List<StylesBodyNode> getStylesBodyNodeList() {
        return stylesBodyNodeList;
    }

    public void setStylesBodyNodeList(List<StylesBodyNode> stylesBodyNodeList) {
        this.stylesBodyNodeList = stylesBodyNodeList;
    }

    @Override
    public String toString() {
        return "StylesNode{" +
                "stylesBodyNodeList=" + stylesBodyNodeList +
                '}';
    }
}
