package ControlStatements;

public class leapyear {

    public static void main(String[] args) {


        int year;
        year = 2000;
        if (year %4==0  && year % 100 !=0 || year % 400 !=0) {
            System.out.println("it is a leap year");

        } else {
            System.out.println("it is not a leap year");
        }

    }
}