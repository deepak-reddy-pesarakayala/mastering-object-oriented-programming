import java.util.*;
class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: Employee");
    }
}
class Manager extends Employee {
    Manager(String name) {
        super(name);
    }
    void display() {
        System.out.println("Manager Name: " + name);
        System.out.println("Designation: Manager");
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String employeeName = sc.next();
        String managerName = sc.next();
        Employee employee = new Employee(employeeName);
        Manager manager = new Manager(managerName);
        employee.display();
        manager.display();
        sc.close();
    }
}
