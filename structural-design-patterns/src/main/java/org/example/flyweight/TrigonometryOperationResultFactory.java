package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TrigonometryOperationResultFactory {
    private static final Map<CalculationRequest, Double> calculationRequestResultMap = new HashMap<>();

    public static Double getTrigonometryOperationResult(CalculationRequest calculationRequest) {
        Double result = calculationRequestResultMap.get(calculationRequest);
        if (result == null) {
            result = calculate(calculationRequest);
            calculationRequestResultMap.put(calculationRequest, result);
        }
        return result;
    }

    private static Double calculate(CalculationRequest calculationRequest) {
        return switch (calculationRequest.getFunction()) {
            case COS -> Math.cos(calculationRequest.getInput());
            case SIN -> Math.sin(calculationRequest.getInput());
            case TAN -> Math.tan(calculationRequest.getInput());
            case CTG -> Math.tanh(calculationRequest.getInput());
        };
    }
}
