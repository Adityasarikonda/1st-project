package inheritance;

public class RoyalBankEngland {
      float  i;
     void interest(float i){
         System.out.println("The royal bank of england has declared interest rates for loans is" + i + "%");
     }

    public static void main(String[] args) {
        RoyalBankEngland r1 = new RoyalBankEngland();
              r1.interest(9.3f);
    }
}
