package Sample;

public class sphere {
     float f1;
     float f2;
     int r1;
      int r2;

      void volume(float f1, float f2, int r1, int r2){
          System.out.println("Volume of sphere is"+ f1*f2*r1*r2);
      }
      public static void main(String args[]){
          sphere s1 = new sphere();
          s1.volume(4/3f,3.14f,6,6);
      }
}
