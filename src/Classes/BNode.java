package Classes;

public class BNode extends HtmlElementNode{
    String TAG_VALUE;

    public BNode(int line, int column) {
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
        return "BNode{" +
                "TAG_VALUE='" + TAG_VALUE + '\'' +
                '}';
    }
}
