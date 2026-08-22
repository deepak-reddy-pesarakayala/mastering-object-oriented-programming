import java.util.*;
class Payment {
    void process(double amount) {
        System.out.println("Processing payment of $" + amount);
    }
}
class CreditCard extends Payment {
    void process(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
class PayPal extends Payment {
    void process(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
class Bitcoin extends Payment {
    void process(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double amount = sc.nextDouble();
        if(choice < 1 || choice > 3 || amount < 0) {
            System.out.println("Invalid input");
        } else {
            Payment p;
            if(choice == 1)
                p = new CreditCard();
            else if(choice == 2)
                p = new PayPal();
            else
                p = new Bitcoin();

            p.process(amount);
        }
        sc.close();
    }
}