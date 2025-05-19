package Classes;

public class ImportedSymbolNode extends ASTNode{
    String MODULE_NAME;

    public ImportedSymbolNode(int line, int column) {
        super(line, column);
    }

    public String getMODULE_NAME() {
        return MODULE_NAME;
    }

    public void setMODULE_NAME(String MODULE_NAME) {
        this.MODULE_NAME = MODULE_NAME;
    }

    @Override
    public String toString() {
        return "ImportedSymbolNode{" +
                "MODULE_NAME='" + MODULE_NAME + '\'' +
                '}';
    }
}
