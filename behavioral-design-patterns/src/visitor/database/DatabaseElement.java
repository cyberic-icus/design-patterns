package visitor.database;

import visitor.visitor.DatabaseVisitor;

public interface DatabaseElement {

    String accept(DatabaseVisitor visitor);
}