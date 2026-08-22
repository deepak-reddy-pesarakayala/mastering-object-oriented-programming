import java.util.*;
public class Solution {
    static int operations = 0;
    static int add(int a, int b) {
        operations++;
        return a + b;
    }
    static int subtract(int a, int b) {
        operations++;
        return a - b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int a = sc.nextInt();
        if(!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int b = sc.nextInt();
        if(a < -1000000 || a > 1000000 || b < -1000000 || b > 1000000) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Sum: " + add(a, b));
            System.out.println("Difference: " + subtract(a, b));
            System.out.println("Operations performed: " + operations);
        }
        sc.close();
    }
}