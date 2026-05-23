import java.util.Scanner;
class Person {
    String name;
    int age;
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        if (age < 1 || age > 100) {
            System.out.println("Invalid Age");
        } else {
            Person p = new Person();
            p.name = name;
            p.age = age;
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
        }
    }
}