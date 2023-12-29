package inheritance;

public class HalifaxBank extends LlodysBank {
     float interest(){
         return 8.9f;
     }

    public static void main(String[] args) {
        HalifaxBank h1 = new HalifaxBank();
        h1.interest();
        System.out.println(h1.interest());
    }
}
