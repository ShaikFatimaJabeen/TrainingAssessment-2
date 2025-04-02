import java.util.Scanner;

class Vehicle {
    String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }
    void display() {
        System.out.println("Brand: " + brand);
    }
}
class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
}
class VehicleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle brand: ");
        String brand = sc.nextLine();
        Car car = new Car(brand);
        car.display();
        sc.close();
    }
}