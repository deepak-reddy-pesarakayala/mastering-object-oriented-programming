import java.util.Scanner;
class Student {
    int id, age, grade;
    Student(int i, int a, int g) {
        id = i;
        age = a;
        grade = g;
    }
    void display() {
        System.out.println("Student ID: " + id + ", Age: " + age + ", Grade: " + grade);
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int age = sc.nextInt();
        int grade = sc.nextInt();
        if (id > 0 && age > 0 && grade > 0) {
            Student s = new Student(id, age, grade);
            s.display();
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}