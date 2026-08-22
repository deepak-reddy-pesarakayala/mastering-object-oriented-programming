import java.util.*;
public class Solution {
    static void welcomeMessage() {
        System.out.print("Welcome to the channel: ");
    }
    static void welcomeMessage(String name) {
        System.out.print(name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        while(sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if(!line.isEmpty()) {
                if(s.length()>0) s.append(" ");
                s.append(line);
            }
        }
        String[] a = s.toString().split("\\s+");
        if(a.length==2&&a[0].length()>=4&&a[1].length()>=4) {
            welcomeMessage();
            welcomeMessage(a[0]);
            System.out.print(" ");
            welcomeMessage(a[1]);
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}