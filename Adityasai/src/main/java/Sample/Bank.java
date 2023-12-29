package Sample;

public class Bank {

    static int currentbalance = 1000;
    public static void greetcustomer(){
        System.out.println("hello, welcome to the bank");

    }

    public void deposit(int amount){
        currentbalance = currentbalance + amount;
        System.out.println("Amount is deposited succesffully");
    }
    public static  void withdrawal(int amount){
        currentbalance = currentbalance -  amount;
        System.out.println("Amount is withdrawn succesffully");
    }
    public  int getcurrentbalance(){
        return currentbalance;
    }
    public static void main(String[] args) {
        Bank bank = new Bank();
        greetcustomer();
        System.out.println("current balance is :"+bank.getcurrentbalance());
        bank.deposit(500);
        System.out.println("current balance is :"+bank.getcurrentbalance());
        withdrawal(300);
        System.out.println("current balance is :"+bank.getcurrentbalance());
    }
}
