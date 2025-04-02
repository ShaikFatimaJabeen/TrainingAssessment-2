import java.util.*;
import java.util.Arrays;
import java.util.Comparator;

import java.util.Scanner;

class ProductComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of product 1: ");
        double price1 = sc.nextDouble();
        System.out.print("Enter price of product 2: ");
        double price2 = sc.nextDouble();
        System.out.println("Cheaper product price: " + Math.min(price1, price2));
        sc.close();
    }
}
