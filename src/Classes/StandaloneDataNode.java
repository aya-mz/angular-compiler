package Classes;

public class StandaloneDataNode extends ComponentEntryNode{
    String STANDALONE_VALUE;

    public StandaloneDataNode(int line, int column) {
        super(line, column);
    }

    public String getSTANDALONE_VALUE() {
        return STANDALONE_VALUE;
    }

    public void setSTANDALONE_VALUE(String STANDALONE_VALUE) {
        this.STANDALONE_VALUE = STANDALONE_VALUE;
    }

    @Override
    public String toString() {
        return "StandaloneDataNode{" +
                "STANDALONE_VALUE='" + STANDALONE_VALUE + '\'' +
                '}';
    }
}
