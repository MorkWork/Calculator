public class Calculator {
    public static float Calculate(float num1, String operation, float num2) throws Exception {
            float result;
             switch (operation){
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default: throw new Exception("No such operation!!");
            }
           return result;
        }
}
