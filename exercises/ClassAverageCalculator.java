import java.util.*;
public class Solution {
    static double total = 0;
    static int count = 0;
    static void addGrade(double grade) {
        total += grade;
        count++;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStudents = sc.nextInt();
        for(int i = 0; i < numStudents; i++) {
            addGrade(sc.nextDouble());
        }
        System.out.printf("%.2f", total / count);
        sc.close();
    }
}