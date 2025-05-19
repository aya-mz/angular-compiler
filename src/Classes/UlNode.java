package Classes;

public class UlNode extends HtmlElementNode{
    String TAG_VALUE;

    public UlNode(int line, int column) {
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
        return "UlNode{" +
                "TAG_VALUE='" + TAG_VALUE + '\'' +
                '}';
    }
}
