
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment using Credit Card");
        System.out.println("Amount Paid: Rs. " + amount);
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment using UPI");
        System.out.println("Amount Paid: Rs. " + amount);
    }
}

class PayPalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment using PayPal");
        System.out.println("Amount Paid: Rs. " + amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCardPayment();
        p.pay(5000);

        System.out.println();

        p = new UPIPayment();
        p.pay(2000);

        System.out.println();

        p = new PayPalPayment();
        p.pay(3000);
    }
}
