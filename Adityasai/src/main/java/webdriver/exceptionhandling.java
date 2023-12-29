package webdriver;

public class exceptionhandling {

    public static void main(String[] args) {

        System.out.println("person age");
        try {
            int a = 17;
            int b = 0;
            int age = a/b;

                if(age<18){
                    System.out.println("person not eligible to vote");
                }
        }

        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("person is not eligible");
        }



    }
}
