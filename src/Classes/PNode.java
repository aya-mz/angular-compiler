package Classes;

public class PNode extends HtmlElementNode{
    String TAG_VALUE;

    public PNode(int line, int column) {
        super(line, column);
    }

    public String getTAG_VALUE() {
        return TAG_VALUE;
    }

    public void setTAG_VALUE(String TAG_VALUE) {
        this.TAG_VALUE = TAG_VALUE;
    }

    @Override
    public String toString() {
        return "PNode{" +
                "TAG_VALUE='" + TAG_VALUE + '\'' +
                '}';
    }
}
