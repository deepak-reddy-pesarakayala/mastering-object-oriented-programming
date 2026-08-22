import java.util.*;
class Product {
    String name;
    double price;
    int quantity;
    Product() {
        name = "Unknown";
        price = 0.0;
        quantity = 0;
    }
    Product(String n, double p) {
        name = n;
        price = p;
    }
    Product(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }
    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        Product p;
        if(type == 1)
            p = new Product();
        else if(type == 2)
            p = new Product(sc.next(), sc.nextDouble());
        else
            p = new Product(sc.next(), sc.nextDouble(), sc.nextInt());
        p.display();
    }
}