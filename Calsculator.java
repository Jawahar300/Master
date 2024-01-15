import java.util.Scanner;

public class Calsculator {
    public static void addition(double firstNumber, double secondNumber) {
        double finalValue = firstNumber + secondNumber;
        System.out.println("Final Answer is " + finalValue);
    }

    public static void subtraction(double firstNumber, double secondNumber) {
        double finalValue = firstNumber - secondNumber;
        System.out.println("Final Answer is " + finalValue);
    }

    public static void multiplication(double firstNumber, double secondNumber) {
        double finalValue = firstNumber * secondNumber;
        System.out.println("Final Answer is " + finalValue);
    }

    public static void division(double firstNumber, double secondNumber) {
        double finalValue = firstNumber / secondNumber;
        System.out.println("Final Answer is " + finalValue);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculator...");
        System.out.println("Select 1 to perform Addition..");
        System.out.println("Select 2 to perform Subtraction..");
        System.out.println("Select 3 to perform Multiplication..");
        System.out.println("Select 4 to perform Division..");
        String operator = scanner.nextLine();
        System.out.println("Enter the first Number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the first Number");
        double secondNumber = scanner.nextDouble();
        scanner.close();

        if (operator.equals("1")) addition(firstNumber, secondNumber);
        if (operator.equals("2")) subtraction(firstNumber, secondNumber);
        if (operator.equals("3")) multiplication(firstNumber, secondNumber);
        if (operator.equals("4"))
            if (secondNumber == 0) {
                System.out.println("The output is infinity..");
            } else {
                division(firstNumber, secondNumber);
            }
    }
}
