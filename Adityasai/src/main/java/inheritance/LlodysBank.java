package inheritance;

public class LlodysBank extends RoyalBankEngland{
    float i;
    void interest(float i){
        System.out.println("The lloyds bank has declared  more interest rates as compared to royal bank  for loans is" + i +"%");
    }

    public static void main(String[] args) {
        LlodysBank l1 = new LlodysBank();
        l1.interest(9.6f);

    }
}
