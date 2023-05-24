package visitor.database;

import visitor.visitor.DatabaseVisitor;

import java.util.List;

public class Schema implements DatabaseElement {

    private String name;
    private List<String> tables;


    public Schema(String name, List<String> tables) {
        this.name = name;
        this.tables = tables;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTables() {
        return tables;
    }

    public void setTables(List<String> tables) {
        this.tables = tables;
    }

    @Override
    public String accept(DatabaseVisitor visitor) {
        return visitor.visit(this);
    }

}