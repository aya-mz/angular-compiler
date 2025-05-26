package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class RepeatDefinition_SymbolTable {
    List<Row>symbolTable;
    int selector=0,standalone=0,imports=0,template=0,styles=0,
            app=0,p_list=0,p_card=0,p_cardh=0,p_cardi=0,p_details=0,p_detailsi=0;

    public RepeatDefinition_SymbolTable() {
        this.symbolTable = new ArrayList<>();
    }

    public void addVariable(String variableName,String type,String scope, int line, int column){
        Row row=new Row(variableName,type,scope,"unnecessary",line,column);
        symbolTable.add(row);
    }

    public boolean checkApp(){
        if(app!=0)
            return false;
        app++;
        return true;
    }

    public boolean checkP_list(){
        if(p_list!=0)
            return false;
        p_list++;
        return true;
    }

    public boolean checkP_card(){
        if(p_card!=0)
            return false;
        p_card++;
        return true;
    }

    public boolean checkP_card_i(){
        if(p_cardi!=0)
            return false;
        p_cardi++;
        return true;
    }

    public boolean checkP_card_h(){
        if(p_cardh!=0)
            return false;
        p_cardh++;
        return true;
    }

    public boolean checkP_details(){
        if(p_details!=0)
            return false;
        p_details++;
        return true;
    }

    public boolean checkP_details_i(){
        if(p_detailsi!=0)
            return false;
        p_detailsi++;
        return true;
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

    public boolean TemplateIsExist(){
        if (template==0)
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Definition Symbol Table:\n");
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
