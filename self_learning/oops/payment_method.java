// JUST SOME PRACTICE

interface PaymentMethod{
    void pay();
}
class creditcard implements PaymentMethod{
    public void pay(){
        System.out.println("payment by credit card");
    }
}

class upi implements PaymentMethod{
    public void pay(){
        System.out.println("paying via upi");
    }
}

public class payment_method {
    public static void Pay(PaymentMethod pm){
        pm.pay();
    }

    public static void main(String[] args) {
        PaymentMethod pm = new creditcard();
        pm.pay();
    }
}
