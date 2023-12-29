package Sample;

public class calculations {

    int a;
    int b;
    int c;
    public void add(int a ,int b){
        System.out.println("Add 2 numbers ="+ (a+b));

    }
    public void add(int a, int b, int c){
        System.out.println("Add 3 numbers="+ (a+b+c));

    }

    public static void main(String[] args) {
        calculations c1 = new calculations();
        c1.add(1,2);
        c1.add(1,2,3);
    }
}
