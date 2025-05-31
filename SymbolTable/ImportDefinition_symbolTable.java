package SymbolTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ImportDefinition_symbolTable {
    Map<String, String> angularModuleSources = Map.ofEntries(
            Map.entry("Component", "@angular/core"),
            // Angular Core Modules
            Map.entry("CommonModule", "@angular/common"),
            Map.entry("FormsModule", "@angular/forms"),
            Map.entry("ReactiveFormsModule", "@angular/forms"),
            Map.entry("RouterModule", "@angular/router"),
            Map.entry("HttpClientModule", "@angular/common/http"),
            Map.entry("BrowserModule", "@angular/platform-browser"),
            Map.entry("BrowserAnimationsModule", "@angular/platform-browser/animations"),
            Map.entry("NgOptimizedImage", "@angular/common"),
            // Angular Material Modules
            Map.entry("MatButtonModule", "@angular/material/button"),
            Map.entry("MatInputModule", "@angular/material/input"),
            Map.entry("MatCardModule", "@angular/material/card"),
            Map.entry("MatToolbarModule", "@angular/material/toolbar"),
            Map.entry("MatIconModule", "@angular/material/icon"),
            Map.entry("MatSidenavModule", "@angular/material/sidenav"),
            Map.entry("MatListModule", "@angular/material/list"),
            Map.entry("MatTableModule", "@angular/material/table"),
            Map.entry("MatDialogModule", "@angular/material/dialog"),
            Map.entry("MatSnackBarModule", "@angular/material/snack-bar"),
            // Angular CDK Modules
            Map.entry("DragDropModule", "@angular/cdk/drag-drop"),
            Map.entry("ScrollingModule", "@angular/cdk/scrolling"),
            Map.entry("OverlayModule", "@angular/cdk/overlay"),
            Map.entry("PortalModule", "@angular/cdk/portal"),
            Map.entry("ClipboardModule", "@angular/cdk/clipboard"),
            Map.entry("LayoutModule", "@angular/cdk/layout")
    );
    public List<Row>symbolTable;

    public ImportDefinition_symbolTable() {
        this.symbolTable=new ArrayList<>();
    }

    public void addVariable(String variableName,String type,String scope, String value, int line, int column){
        Row row=new Row(variableName,type,scope,value,line,column);
        symbolTable.add(row);
    }

    public boolean nameIsExist(String name){
        return angularModuleSources.containsKey(name);
    }

    public boolean fromIsExist(String from){
        from=from.trim();
        if(!angularModuleSources.containsValue(from))
            return false;
        return true;
    }

    public boolean isExist(String name,String from){
        name = name.trim();
        from=from.trim();
        if(angularModuleSources.get(name)!=null&&!angularModuleSources.get((String) name).equals((String) from))
            return false;
        return true;
    }

    public boolean isDefinition(String name){
        for(Row r : symbolTable){
            if(r.getName().equals(name))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Import Definition Symbol Table:\n");
        stringBuilder.append("*".repeat(160)).append("\n");

        int idWidth = 10;
        int nameWidth = 25;
        int typeWidth = 20;
        int scopeWidth = 20;
        int valueWidth = 80;

        stringBuilder.append(String.format("| %-10s | %-25s | %-20s | %-20s | %-80s |\n", "ID", "Variable Name", "Type", "Scope", "From"));
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
