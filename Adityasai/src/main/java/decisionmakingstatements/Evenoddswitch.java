package decisionmakingstatements;

import java.util.Scanner;

public class Evenoddswitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        int remainder = number%2;
        switch (remainder){
            case 0:
                System.out.println("number is even");
                break;
            case 1 :
                System.out.println("number is odd");
                break;
            default:
                System.err.println("invalid number");
        }

        scanner.close();
    }
}
