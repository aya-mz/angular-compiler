package SymbolTable;

public class UndefinitionImportException extends RuntimeException {
    public UndefinitionImportException(String message) {
        super(message);
    }
}
