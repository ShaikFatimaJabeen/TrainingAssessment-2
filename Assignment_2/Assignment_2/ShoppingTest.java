import java.util.Scanner;

abstract class Shopping {
    abstract void buyProduct();
}
class OnlineStore extends Shopping {
    void buyProduct() {
        System.out.println("Product purchased from online store.");
    }
}
class ShoppingTest {
    public static void main(String[] args) {
        Shopping shop = new OnlineStore();
        shop.buyProduct();
    }
}