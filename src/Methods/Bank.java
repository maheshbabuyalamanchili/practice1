package Methods;

public class Bank {
    static int currentbalance=1000;
    public static void main(String[] args) {
    Bank b =new Bank();
    greetcustomer();
        System.out.println("currentbal:"+currentbalance);
    b.deposit(500);
    System.out.println("current balance :"+b.getcurrentbal());
    withdrawl(300);
        System.out.println("current balance :"+b.getcurrentbal());
    }

    public static void greetcustomer(){
        System.out.println("hello welcome to banking application");
    }
    public void deposit(int amount){
       currentbalance=currentbalance+amount;
        System.out.println("amount deposit successfully");
    }
    public  static void withdrawl(int amount){
        currentbalance=currentbalance-amount;
        System.out.println("amount withdraw successfully");
    }

    public int getcurrentbal(){
return currentbalance;
    }
}

