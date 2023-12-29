package loopingstatements;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the starting number");
        int startingnumber = scanner.nextInt();
        System.out.println("please enter the ending number");
        int endingnumber = scanner.nextInt();


        for (int number = startingnumber;number<endingnumber;number++)
        {
            System.out.println(number);
        }

        scanner.close();
    }
}
