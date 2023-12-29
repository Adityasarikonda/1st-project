package decisionmakingstatements;

import java.util.Scanner;

public class passfail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the marks");
        int marks = scanner.nextInt();
        if(marks<35){
            System.out.println("student is fail");
        } else if (marks>35 && marks<=70) {
            System.out.println("student got second class");

        } else if (marks>70 && marks<=80) {
            System.out.println("student got 1st class");
        } else if (marks>80 && marks<=100) {

            System.out.println("student got merit");
        }else{
            System.out.println("invalid number");
        }
    }
}
