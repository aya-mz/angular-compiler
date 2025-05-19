package Classes;

public class H5Node extends HtmlElementNode{
    String TAG_VALUE;

    public H5Node(int line, int column) {
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
        return "H5Node{" +
                "TAG_VALUE='" + TAG_VALUE + '\'' +
                '}';
    }
}
