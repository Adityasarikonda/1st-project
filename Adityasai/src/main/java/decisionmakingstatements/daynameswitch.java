package decisionmakingstatements;

import java.util.Scanner;

public class daynameswitch {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day name");
        String day = scanner.next();
        switch (day){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thrusday":
            case "friday":
                System.out.println("uff, its a weekday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("yay, its a weekend");
                break;
            default:
                System.err.println("invalid day");

        }
        scanner.close();
    }
}
