package Classes;

public class H3Node extends HtmlElementNode{
    String TAG_VALUE;

    public H3Node(int line, int column) {
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
        return "H3Node{" +
                "TAG_VALUE='" + TAG_VALUE + '\'' +
                '}';
    }
}
