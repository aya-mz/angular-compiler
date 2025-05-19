package Classes;

public class H6Node extends HtmlElementNode{
    String TAG_VALUE;

    public H6Node(int line, int column) {
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
        return "H6Node{" +
                "TAG_VALUE='" + TAG_VALUE + '\'' +
                '}';
    }
}
