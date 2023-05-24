package visitor.visitor;

import visitor.database.Database;
import visitor.database.Schema;

public class XMLDatabaseVisitorImpl implements DatabaseVisitor {

    @Override
    public String visit(Schema schema) {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n" +
                "<schema>" + "\n" +
                "    <name>" + schema.getName() + "</id>" + "\n" +
                "    <name>" + schema.getTables() + "</id>" + "\n" +
                "</schema>";
    }

    @Override
    public String visit(Database database) {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n" +
                "<schema>" + "\n" +
                "    <name>" + database.getName() + "</id>" + "\n" +
                "    <name>" + database.getSchemas()+ "</id>" + "\n" +
                "</schema>";
    }

}