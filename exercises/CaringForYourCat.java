import java.util.Scanner;
class Cat {
    int age;
    int weight;
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cat c = new Cat();
        c.age = sc.nextInt();
        c.weight = sc.nextInt();
        System.out.println("Age: " + c.age);
        System.out.println("Weight: " + c.weight);
        if (c.age >= 1 && c.age <= 15 && c.weight >= 2 && c.weight <= 10) {
            System.out.println("Health Status: Healthy");
        } else {
            System.out.println("Health Status: Unhealthy");
        }
    }
}