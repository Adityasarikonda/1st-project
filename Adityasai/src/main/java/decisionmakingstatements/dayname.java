package decisionmakingstatements;

import java.util.Scanner;

public class dayname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day name");
        String day = scanner.nextLine();
        if(day.equals("monday")||
                day.equals("tuesday")||
                day.equals("wednesday")||
                day.equals("thrusday")||
                day.equals("friday"))
            System.out.println("Uff, its a weekday.");
        else if (day.equals("saturday")||day.equals("sunday")) {
            System.out.println("Yay, its a weekend.");

        }
        scanner.close();


    }
}


