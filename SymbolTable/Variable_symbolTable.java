package SymbolTable;

import java.util.*;

public class Variable_symbolTable {
    Map<String,Row> symbolTable;
    List<String>Im= Arrays.asList("CommonModule", "FormsModule", "ReactiveFormsModule", "RouterModule",
            "HttpClientModule", "BrowserAnimationsModule", "BrowserModule", "NgOptimizedImage",
            "MatButtonModule", "MatInputModule", "MatCardModule", "MatToolbarModule", "MatIconModule",
            "MatSidenavModule", "MatListModule", "MatTableModule", "MatDialogModule", "MatSnackBarModule",
            "DragDropModule", "ScrollingModule", "OverlayModule", "PortalModule", "ClipboardModule", "LayoutModule");

    public Variable_symbolTable() {
        this.symbolTable = new LinkedHashMap<>();
    }

    public void addVariable(String variableName,String type,String scope,Object value, int line, int column){
        Row row=new Row(variableName,type,scope,value,line,column);
        symbolTable.put(variableName,row);
    }

    public boolean ExistImport(String value){
        if(!Im.contains(value))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Variable Symbol Table:\n");
        stringBuilder.append("*".repeat(160)).append("\n");

        int idWidth = 10;
        int nameWidth = 25;
        int typeWidth = 20;
        int scopeWidth = 20;
        int valueWidth = 80;

        stringBuilder.append(String.format("| %-10s | %-25s | %-20s | %-20s | %-80s |\n", "ID", "Variable Name", "Type", "Scope", "Value"));
        stringBuilder.append("*".repeat(160)).append("\n");

        int id = 1;
        for (Row row : symbolTable.values()) {
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
