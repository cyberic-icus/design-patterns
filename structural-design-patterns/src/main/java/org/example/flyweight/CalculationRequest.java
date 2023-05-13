package org.example.flyweight;

public class CalculationRequest {
    private final Double input;
    private final TrigonometryFunction function;


    public TrigonometryFunction getFunction() {
        return function;
    }

    public Double getInput() {
        return input;
    }

    public CalculationRequest(Double input, TrigonometryFunction function) {
        this.input = input;
        this.function = function;
    }
}
