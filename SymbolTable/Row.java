package SymbolTable;

public class Row {
    String name,type,scope;
    Object value;
    int line,column;

    public Row(String name, String type, String scope, Object value, int line, int column) {
        this.name = name;
        this.type = type;
        this.scope = scope;
        this.value = value;
        this.line = line;
        this.column = column;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getValue() {
        return value.toString();
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-20s | %-15s | %-20s | %-20s |", name, type, scope, value != null ? value : "null");
    }
}
