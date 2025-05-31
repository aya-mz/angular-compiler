package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class RepeatDefinitionComponent_symbolTable {
    List<Row>symbolTable;
    int selector=0,standalone=0,imports=0,template=0,styles=0;

    public RepeatDefinitionComponent_symbolTable() {
        this.symbolTable = new ArrayList<>();
    }

    public void addVariable(String variableName,String type,String scope, int line, int column){
        Row row=new Row(variableName,type,scope,"unnecessary",line,column);
        symbolTable.add(row);
    }

    public boolean checkSelector(){
        if(selector!=0)
            return false;
        selector++;
        return true;
    }

    public boolean checkStandalone(){
        if(standalone!=0)
            return false;
        standalone++;
        return true;
    }

    public boolean checkImports(){
        if(imports!=0)
            return false;
        imports++;
        return true;
    }

    public boolean checkTemplate(){
        if(template!=0)
            return false;
        template++;
        return true;
    }

    public boolean checkStyles(){
        if(styles!=0)
            return false;
        styles++;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Definition Component Symbol Table:\n");
        stringBuilder.append("*".repeat(160)).append("\n");

        int idWidth = 10;
        int nameWidth = 25;
        int typeWidth = 20;
        int scopeWidth = 20;
        int valueWidth = 80;

        stringBuilder.append(String.format("| %-10s | %-25s | %-20s | %-20s | %-80s |\n", "ID", "Variable Name", "Type", "Scope", "Value"));
        stringBuilder.append("*".repeat(160)).append("\n");

        int id = 1;
        for (Row row : symbolTable.reversed()) {
            String value = row.getValue() != null ? row.getValue() : "null";
            String formattedValue = formatValue(value, valueWidth);
            stringBuilder.append(String.format("| %-10d | %-25s | %-20s | %-20s | %-80s |\n", id++, row.getName(), row.getType(), row.getScope(), formattedValue));
        }

        stringBuilder.append("*".repeat(160)).append("\n");
        return stringBuilder.toString();
    }

    private String formatValue(String value, int maxLength) {
        StringBuilder formattedValue = new StringBuilder();

        while (value.length() > maxLength) {
            formattedValue.append(value, 0, maxLength).append("\n");
            value = value.substring(maxLength);
        }

        formattedValue.append(value);

        return formattedValue.toString();
    }
}
