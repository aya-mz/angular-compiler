package SymbolTable;

public class TemplatExist_symbolTable {
    RepeatDefinitionComponent_symbolTable repeatDefinitionComponentSymbolTable;

    public TemplatExist_symbolTable(RepeatDefinitionComponent_symbolTable repeatDefinitionComponentSymbolTable) {
        this.repeatDefinitionComponentSymbolTable = repeatDefinitionComponentSymbolTable;
    }

    public boolean templateIsExist(){
        if(repeatDefinitionComponentSymbolTable.template==0){
            return false;
        }
        return true;
    }
}
