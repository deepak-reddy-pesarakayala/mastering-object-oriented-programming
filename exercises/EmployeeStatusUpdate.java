import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        boolean status = sc.nextBoolean();
        System.out.print("Employee statuses: ");
        if (status) {
            System.out.println("Employee " + name + " is currently active.");
        } else {
            System.out.println("Employee " + name + " is currently inactive.");
        }
        sc.close();
    }
}