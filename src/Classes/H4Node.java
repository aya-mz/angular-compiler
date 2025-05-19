package Classes;

public class H4Node extends HtmlElementNode{
    String TAG_VALUE;

    public H4Node(int line, int column) {
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
        return "H4Node{" +
                "TAG_VALUE='" + TAG_VALUE + '\'' +
                '}';
    }
}
