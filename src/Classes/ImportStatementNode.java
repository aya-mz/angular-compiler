package Classes;

import java.util.List;

public class ImportStatementNode extends ASTNode{
    List<ImportedSymbolNode> importedSymbolNode;

    public ImportStatementNode(int line, int column) {
        super(line, column);
    }

    public List<ImportedSymbolNode> getImportedSymbolNode() {
        return importedSymbolNode;
    }

    public void setImportedSymbolNode(List<ImportedSymbolNode> importedSymbolNode) {
        this.importedSymbolNode = importedSymbolNode;
    }

    @Override
    public String toString() {
        return "ImportStatementNode{" +
                "importedSymbolNode=" + importedSymbolNode +
                '}';
    }
}
