package _08_clean_code.pratices.rename_variable_separate_constant;

public class Calculator {
    public static int calculate(int a, int secondOperand, char operator) {
        switch (operator) {
            case '+':
                return a + secondOperand;
            case '-':
                return a - secondOperand;
            case '*':
                return a * secondOperand;
            case '/':
                if (secondOperand != 0)
                    return a / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
