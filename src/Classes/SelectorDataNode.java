package Classes;

public class SelectorDataNode extends ComponentEntryNode{
    String SELECTOR_BODY;

    public SelectorDataNode(int line, int column) {
        super(line, column);
    }

    public String getSELECTOR_BODY() {
        return SELECTOR_BODY;
    }

    public void setSELECTOR_BODY(String SELECTOR_BODY) {
        this.SELECTOR_BODY = SELECTOR_BODY;
    }

    @Override
    public String toString() {
        return "SelectorDataNode{" +
                "SELECTOR_BODY='" + SELECTOR_BODY + '\'' +
                '}';
    }
}
