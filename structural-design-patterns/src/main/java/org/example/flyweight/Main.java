package org.example.flyweight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<CalculationRequest>();
        for (int i = 0; i < 100000; i++) {
            if (i % 2 == 0) {
                list.add(new CalculationRequest(0.2, TrigonometryFunction.COS));
            } else if (i % 3 == 0){
                list.add(new CalculationRequest(0.3, TrigonometryFunction.SIN));
            }
        }

        for (CalculationRequest request: list) {
            System.out.println(TrigonometryOperationResultFactory.getTrigonometryOperationResult(request));
        }

    }
}
