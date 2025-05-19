package Classes;

public class ImportFromNode extends ASTNode{
    String STRING_LITERAL;

    public ImportFromNode(int line, int column) {
        super(line, column);
    }

    public String getSTRING_LITERAL() {
        return STRING_LITERAL;
    }

    public void setSTRING_LITERAL(String STRING_LITERAL) {
        this.STRING_LITERAL = STRING_LITERAL;
    }

    @Override
    public String toString() {
        return "ImportFromNode{" +
                "STRING_LITERAL='" + STRING_LITERAL + '\'' +
                '}';
    }
}
