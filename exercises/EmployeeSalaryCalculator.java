import java.util.*;
class Employee {
    int salary;
    Employee(int salary) {
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee Salary: " + salary);
    }
}
class Manager extends Employee {
    int bonus; 
    Manager(int salary, int bonus) {
        super(salary);
        this.bonus = bonus;
    }
    void display() {
        System.out.println("Manager Salary: " + (salary + bonus));
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employeeSalary = sc.nextInt();
        int managerSalary = sc.nextInt();
        int bonus = sc.nextInt();
        Employee e = new Employee(employeeSalary);
        Manager m = new Manager(managerSalary, bonus);
        e.display();
        m.display();
        sc.close();
    }
}