import java.util.Scanner;
public class Solution {
    static int calculateArea(int length, int width) {
        return length * width;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt(); 
        if (length < 0 || width < 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(calculateArea(length, width));
        }
        scanner.close();
    }
}