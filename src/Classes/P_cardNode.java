package Classes;

public class P_cardNode extends StylesBodyNode{
    String CSS_BODY;

    public P_cardNode(int line, int column) {
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
        return "P_cardNode{" +
                "CSS_BODY='" + CSS_BODY + '\'' +
                '}';
    }
}
