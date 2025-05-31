package SymbolTable;

public class UndeclaredIdentifierException extends RuntimeException {
    public UndeclaredIdentifierException(String message) {
        super(message);
    }
}
