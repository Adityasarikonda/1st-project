package inheritance;



public class NatwestBank extends RoyalBankEngland{
    float i;
    void interest(float i){
        System.out.println("The Natwest bank  has declared  same interest rates as royal bank for loans is" + i + "%");
    }

    public static void main(String[] args) {
        NatwestBank n1 = new NatwestBank();
        n1.interest(9.3f);
    }
}
