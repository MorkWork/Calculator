package com.MorkWork.calculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Input left number: ");
        BigDecimal num1 = new BigDecimal(in.next());
        System.out.print("Input operator: ");
        Calculator.MathOperation operator = Calculator.MathOperation.resolve(in.next());
        System.out.print("Input right number: ");
        BigDecimal num2 = new BigDecimal(in.next());
        try {
            System.out.printf("%s %s %s = %s", num1, operator.getTitle(), num2, Calculator.calculate(num1, operator, num2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}