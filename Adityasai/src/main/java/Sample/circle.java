package Sample;

public class circle {
    int r;
    int r1;
    float f1;

    void area(float f1, int r,int r1){

        System.out.println("Area of circle is"+ f1*r*r1);
    }
    public static void main(String args[]){
        circle c1 = new circle();
         c1.area(3.14f,5,5);
    }

}
