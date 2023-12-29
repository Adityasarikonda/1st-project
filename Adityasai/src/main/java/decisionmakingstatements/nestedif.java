package decisionmakingstatements;

import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {


        String examstatus = "pass";

        if (examstatus == "fail") {
            System.out.println("next round");
            String roundonestatus = "pass";
            if (roundonestatus == "fail") {
                System.out.println("next round");
                String roundtwostatus = "pass";
                if(roundtwostatus == "fail"){
                    System.out.println("next round");
                }
                else {
                    System.out.println("go to home");
                }
            } else {
                System.out.println("go to home");
            }


        }
    }
}