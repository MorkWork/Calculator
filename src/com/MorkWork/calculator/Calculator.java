package com.MorkWork.calculator;

import java.math.BigDecimal;

public class Calculator {
    public static BigDecimal calculate(BigDecimal num1, MathOperation operation, BigDecimal num2) throws Exception {
        BigDecimal result = null;
        switch (operation) {
            case ADDITION:
                result = num1.add(num2);
                break;
            case SUBSTRACTION:
                result = num1.subtract(num2);
                break;
            case MILTIPLYCATION:
                result = num1.multiply(num2);
                break;
            case DIVIDE:
                if (num2.equals(0)) {
                    throw new Exception("Division by zero!!");
                } else {
                    result = num1.divide(num2);
                }
                break;

        }
        return result;
    }


    enum MathOperation {
        ADDITION("+"),
        SUBSTRACTION("-"),
        MILTIPLYCATION("*"),
        DIVIDE("/");

        private String title;

        MathOperation(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public static MathOperation resolve(String operation) throws Exception {
            for (MathOperation i : MathOperation.values()) {
                if (operation.equals(i.title)) {
                    return i;
                }
            }
            throw new Exception("No such operation!!");
        }
    }

}

