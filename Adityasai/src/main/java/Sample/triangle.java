package Sample;

public class triangle {
    int base;
    int height;
    float f1;
    void area(float f1,int h, int b){
        System.out.println("Area of triangle is"+ f1*h*b);
    }

    public static void  main(String args[]){
        triangle t1 = new triangle();
        t1.area(1/2f,9,8);
    }

}
