package Classes;

public class P_detail_iNode extends StylesBodyNode{
    String CSS_BODY;

    public P_detail_iNode(int line, int column) {
        super(line, column);
    }

    public String getCSS_BODY() {
        return CSS_BODY;
    }

    public void setCSS_BODY(String CSS_BODY) {
        this.CSS_BODY = CSS_BODY;
    }

    @Override
    public String toString() {
        return "P_detail_iNode{" +
                "CSS_BODY='" + CSS_BODY + '\'' +
                '}';
    }
}
