package loopingstatements;

import java.util.Scanner;

public class forloop4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the starting number");
        int startingnumber = scanner.nextInt();

        System.out.println("enter the ending number");
        int endingnumber = scanner.nextInt();

        for (int number = startingnumber;number>=endingnumber;number--)
            if(number%2==1)
                System.out.println(number);


        scanner.close();
    }
}
