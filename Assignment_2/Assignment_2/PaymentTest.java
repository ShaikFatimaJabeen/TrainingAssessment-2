import java.util.Scanner;

class Payment {
    void processPayment(int amount) {
        System.out.println("Payment of Rs." + amount + " done using cash.");
    }
    void processPayment(int amount, String cardNumber) {
        System.out.println("Payment of Rs." + amount + " done using card: " + cardNumber);
    }
}
class PaymentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment payment = new Payment();
        System.out.print("Enter payment amount: ");
        int amount = sc.nextInt();
        System.out.print("Enter payment method (cash/card): ");
        String method = sc.next();
        if (method.equals("card")) {
            System.out.print("Enter card number: ");
            String cardNumber = sc.next();
            payment.processPayment(amount, cardNumber);
        } else {
            payment.processPayment(amount);
        }
        sc.close();
    }
}