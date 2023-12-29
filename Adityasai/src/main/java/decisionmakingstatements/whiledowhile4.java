package decisionmakingstatements;

import java.util.Scanner;

public class whiledowhile4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the starting number");
        int startingnumber = scanner.nextInt();
        System.out.println("please enter the ending number");
        int endingnumber = scanner.nextInt();
        int number = startingnumber;
        int sum =0;
        while (number<=endingnumber){
            if (number%2==0)
                sum += number;
                number++;
        }
        System.out.println("sum of even numbers is:"+sum);

        scanner.close();

    }
}