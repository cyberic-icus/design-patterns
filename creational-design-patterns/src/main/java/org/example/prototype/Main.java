package org.example.prototype;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        var first = new PrototypeDatabaseEntity(new ArrayList<>(), new BigDecimal(0));
        var second = (PrototypeDatabaseEntity) first.clone();
        System.out.println(first == second);
    }

}
