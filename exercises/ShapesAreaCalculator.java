import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int shape = sc.nextInt();
        if (shape == 1) {
            int r = sc.nextInt();
            if (r < 0) {
                System.out.println("Invalid input");
            } else {
                System.out.println("Area of Circle: " + (int)(3.14 * r * r));
            }
        } else if (shape == 2) {
            int l = sc.nextInt();
            int b = sc.nextInt();
            if (l < 0 || b < 0) {
                System.out.println("Invalid input");
            } else {
                System.out.println("Area of Rectangle: " + (l * b));
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}