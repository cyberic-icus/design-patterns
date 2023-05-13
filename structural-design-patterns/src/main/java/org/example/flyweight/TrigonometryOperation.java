package org.example.flyweight;

public class TrigonometryOperation {
    private final Double input;
    private final Double output;
    private final TrigonometryFunction function;

    public TrigonometryOperation(Double input, Double output, TrigonometryFunction function) {
        this.input = input;
        this.output = output;
        this.function = function;
    }

    public Double getInput() {
        return input;
    }

    public Double getOutput() {
        return output;
    }

    public TrigonometryFunction getFunction() {
        return function;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrigonometryOperation that = (TrigonometryOperation) o;

        if (getInput() != null ? !getInput().equals(that.getInput()) : that.getInput() != null) return false;
        if (getOutput() != null ? !getOutput().equals(that.getOutput()) : that.getOutput() != null) return false;
        return getFunction() == that.getFunction();
    }

    @Override
    public int hashCode() {
        int result = getInput() != null ? getInput().hashCode() : 0;
        result = 31 * result + (getOutput() != null ? getOutput().hashCode() : 0);
        result = 31 * result + (getFunction() != null ? getFunction().hashCode() : 0);
        return result;
    }
}
