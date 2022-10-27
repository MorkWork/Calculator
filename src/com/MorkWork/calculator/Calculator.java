package com.MorkWork.calculator;

import java.math.BigDecimal;

public class Calculator {
    public BigDecimal calculate(BigDecimal num1, MathOperation operation, BigDecimal num2) throws Exception {
        switch (operation) {
            case ADDITION:
                return num1.add(num2);
            case SUBSTRACTION:
                return num1.subtract(num2);
            case MULTIPLICATION:
                return num1.multiply(num2);
            case DIVISION:
                if (num2.equals(0)) {
                    throw new Exception("Division by zero!!");
                } else {
                    return num1.divide(num2);
                }
            default: throw new Exception("No such operation!!");
        }
    }

}

