package Classes;

public class DetailsNode extends HtmlElementNode{
    String TAG_VALUE;

    public DetailsNode(int line, int column) {
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
        return "DetailsNode{" +
                "TAG_VALUE='" + TAG_VALUE + '\'' +
                '}';
    }
}
