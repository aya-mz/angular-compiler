package Classes;

public class ImportNode extends ASTNode{
    ImportStatementNode importStatementNode;
    ImportFromNode importedFromNode;

    public ImportNode(int line, int column) {
        super(line, column);
    }

    public ImportFromNode getImportedFromNode() {
        return importedFromNode;
    }

    public void setImportedFromNode(ImportFromNode importedFromNode) {
        this.importedFromNode = importedFromNode;
    }

    public ImportStatementNode getImportStatementNode() {
        return importStatementNode;
    }

    public void setImportStatementNode(ImportStatementNode importStatementNode) {
        this.importStatementNode = importStatementNode;
    }

    @Override
    public String toString() {
        return "ImportNode{" +
                "importStatementNode=" + importStatementNode +
                ", importedFromNode=" + importedFromNode +
                '}';
    }
}
