package Sample;

import java.util.Scanner;

public class userinput {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name");
        String name = scanner.nextLine();
        System.out.println("hey," + name + " how are you");
       // System.out.printf("hey %s ,how are you? \n",name);
        String status = scanner.nextLine();
        System.out.println("what is your age?");
        int age = scanner.nextInt();
        System.out.println("Thank you for the information.");
    }
}

