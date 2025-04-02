
class Bank {
    Bank() {
        System.out.println("Banking System Initialized");
    }
}
class Account extends Bank {
    Account() {
        super();
        System.out.println("Account Created");
    }
}
class BankingTest {
    public static void main(String[] args) {
        new Account();
    }
}