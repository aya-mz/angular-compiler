package Classes;

public class H1Node extends HtmlElementNode{
    String TAG_VALUE;

    public H1Node(int line, int column) {
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
        return "H1Node{" +
                "TAG_VALUE='" + TAG_VALUE + '\'' +
                '}';
    }
}
