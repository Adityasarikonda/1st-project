package decisionmakingstatements;

import java.util.Scanner;

public class arthmeticswitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("enter the target operation");
        String operation = scanner.next();
        int result = 0;
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
            case "%":
                result = num1 % num2;
                break;
            default:
                System.err.println("invalid operation");
                break;
                }
                System.out.println(result);

        scanner.close();
    }
}
