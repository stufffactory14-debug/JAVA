public class bank {
    int balance =0;
    int widrawal=0;
    public int amount(int a){
        balance+=a;
        return balance;
    }
    public double amount(double a){
        balance+=a;
        return balance;
    }

    public int withdrawl(int a){
        widrawal+=a;
        balance-=a;
        return widrawal;
    }

    public static void main(String[] args) {
        //create a class bank and overload the method deposite ( amount //int double, withdrawl )
        bank b= new bank();
        System.out.println(b.amount(1000));
        System.out.println(b.amount(5000));
        System.out.println(b.balance);
        System.out.println(b.withdrawl(1000));
        System.out.println(b.balance);




    }

}
