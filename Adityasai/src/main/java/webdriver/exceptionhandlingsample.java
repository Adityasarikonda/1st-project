package webdriver;

public class exceptionhandlingsample {

    public static void main(String[] args) {
        try {


            int a[] = new int[3];

            a[0] = 10;
            a[1] = 20;
            a[2] = 30;
            a[3] = 40;

            for (int i : a) {
                System.out.println(i);

            }
        }
        catch (Exception  e){
            System.out.println(e);
        }
        finally {
            System.out.println("executes at all point of time");
        }

    }
}
