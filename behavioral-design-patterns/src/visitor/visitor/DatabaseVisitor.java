package visitor.visitor;

import visitor.database.Database;
import visitor.database.Schema;

public interface DatabaseVisitor {

    String visit(Schema schema);

    String visit(Database database);
}