package decisionmakingstatements;

import java.util.Scanner;

public class whiledowhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the starting number");
        int startingnumber = scanner.nextInt();

        System.out.println("please enter the ending number");
        int endingnumber = scanner.nextInt();
        int number =startingnumber;

        while (number<=endingnumber){
            System.out.println(number);
            number++;
        }
        scanner.close();
    }
}
