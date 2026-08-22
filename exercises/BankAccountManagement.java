import java.util.*;
public class Solution {
    private String accountHolderName;
    private double balance;
    public Solution() {
        balance = 0;
    }
    public void setAccountHolderName(String name) {
        accountHolderName = name;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setBalance(double balance) {
        this.balance = balance < 0 ? 0 : balance;
    }  
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution account = new Solution();
        String accountHolderName = sc.next();
        double initialBalance = sc.nextDouble();
        double depositAmount = sc.nextDouble();
        account.setAccountHolderName(accountHolderName);
        account.setBalance(initialBalance);
        account.deposit(depositAmount);
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: $" + account.getBalance());
        sc.close();
    }
}