package Classes;

public class P_card_hNode extends StylesBodyNode{
    String CSS_BODY;

    public P_card_hNode(int line, int column) {
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
        return "P_card_hNode{" +
                "CSS_BODY='" + CSS_BODY + '\'' +
                '}';
    }
}
