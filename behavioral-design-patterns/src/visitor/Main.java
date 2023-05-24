package visitor;

import visitor.database.Database;
import visitor.database.DatabaseElement;
import visitor.database.Schema;
import visitor.visitor.DatabaseVisitor;
import visitor.visitor.XMLDatabaseVisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DatabaseVisitor visitor = new XMLDatabaseVisitorImpl();
        DatabaseElement[] items = new DatabaseElement[]{
                new Schema("test", List.of("kekwke")),
                new Schema("affds", List.of("abc")),
                new Database("zxczxc", List.of("asa")),
                new Database("sfdsfdfsd", List.of("xcvxcvxv"))
        };


        Arrays.stream(items).forEach(databaseElement -> System.out.println(databaseElement.accept(visitor)));
    }


}