import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input left number: ");
        float num1 = in.nextFloat();
        System.out.print("Input operator: ");
        String operator = in.next();
        System.out.print("Input right number: ");
        float num2 = in.nextFloat();
        try {
            System.out.printf("%f %s %f = %f", num1, operator, num2, Calculator.Calculate(num1, operator, num2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}