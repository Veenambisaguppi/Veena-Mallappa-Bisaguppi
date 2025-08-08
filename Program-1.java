import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number a:");
        double a = sc.nextDouble();

        System.out.print("Enter number b:");
        double b = sc.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        String op = sc.next();

        double result = 0;
        boolean valid = true;

        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Error: Cannot divide by zero.");
                valid = false;
            } else {
                result = a / b;
            }
        } else {
            System.out.println("Invalid operation.");
            valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
