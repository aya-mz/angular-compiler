package SymbolTable;

public class SymbolTable {
    public RepeatDefinitionComponent_symbolTable r_symbolTable=new RepeatDefinitionComponent_symbolTable();
    public RepeatStylesProperty_symbolTable rs_symbolTable=new RepeatStylesProperty_symbolTable();
    public VariableClass_symbolTable variableClassSymbolTable=new VariableClass_symbolTable();
    public Variable_symbolTable v_symbolTable=new Variable_symbolTable();
    public ImportDefinition_symbolTable importDefinitionSymbolTable=new ImportDefinition_symbolTable();

    public void print(){
        System.out.println(v_symbolTable.toString());
        System.out.println(r_symbolTable.toString());
        System.out.println(rs_symbolTable.toString());
        System.out.println(variableClassSymbolTable.toString());
        System.out.println(importDefinitionSymbolTable.toString());
    }
}
