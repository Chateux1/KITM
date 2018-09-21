package com.company;

import java.util.HashMap;
import java.util.Map;

public class OperatorMap {

    public OperatorMap() {
    }

    public Map<Character, Operation> operatorMap = new HashMap<Character, Operation>();

    public void fillMap() {
        operatorMap.put('+', new Operation() {
            public double execute(double d1, double d2) {
                return d1 + d2;
            }
        });
        operatorMap.put('-', new Operation() {
            public double execute(double d1, double d2) {
                return d1 - d2;
            }
        });
        operatorMap.put('*', new Operation() {
            public double execute(double d1, double d2) {
                return d1 * d2;
            }
        });
        operatorMap.put('/', new Operation() {
            public double execute(double d1, double d2) {
                return d1 / d2;
            }
        });
    }
}

interface Operation {
    public double execute(double d1, double d2);
}