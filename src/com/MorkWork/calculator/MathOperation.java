package com.MorkWork.calculator;

public  enum MathOperation {
    ADDITION("+"),
    SUBSTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/");

    private String title;

    MathOperation(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static MathOperation resolve(String operation) throws Exception {
        for (MathOperation elemOfMathOperation : MathOperation.values()) {
            if (operation.equals(elemOfMathOperation.title)) {
                return elemOfMathOperation;
            }
        }
        throw new Exception("No such operation!!");
    }
}
