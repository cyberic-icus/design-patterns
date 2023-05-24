package visitor.database;

import visitor.visitor.DatabaseVisitor;

import java.util.List;

public class Database implements DatabaseElement {
    private String name;
    private List<String> schemas;

    public Database(String name, List<String> schemas) {
        this.name = name;
        this.schemas = schemas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<String> schemas) {
        this.schemas = schemas;
    }

    @Override
    public String accept(DatabaseVisitor visitor) {
        return visitor.visit(this);
    }

}