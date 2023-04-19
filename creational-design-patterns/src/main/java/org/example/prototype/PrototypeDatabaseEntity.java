package org.example.prototype;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PrototypeDatabaseEntity implements Cloneable {

    private final List<String> someData;
    private final BigDecimal someField;

    public PrototypeDatabaseEntity(List<String> someData, BigDecimal someField) {
        this.someData = someData;
        this.someField = someField;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        var temp = new ArrayList<String>();
        temp.addAll(this.someData);
        return new PrototypeDatabaseEntity(temp, new BigDecimal(this.someField.longValue()));
    }
}
