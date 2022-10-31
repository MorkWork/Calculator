package com.MorkWork.calculator;
import java.math.BigDecimal;
import java.util.Scanner;

public class CalculatorIO {
    public CalculatorIO() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Input left number: ");
        BigDecimal num1 = new BigDecimal(in.next());
        System.out.print("Input operator: ");
        MathOperation operator = MathOperation.resolve(in.next());
        System.out.print("Input right number: ");
        BigDecimal num2 = new BigDecimal(in.next());
        Calculator myCalculator = new Calculator();
        System.out.printf("%s %s %s = %s", num1, operator.getTitle(), num2, myCalculator.calculate(num1, operator, num2));
    }
}
