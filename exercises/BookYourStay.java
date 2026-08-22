import java.util.*;
class HotelBooking {
    int nights;
    int guests;
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelBooking h = new HotelBooking();
        h.nights = sc.nextInt();
        h.guests = sc.nextInt();
        if(h.nights >= 1 && h.nights <= 25 && h.guests >= 1 && h.guests <= 5)
            System.out.println("Booking Confirmed");
        else
            System.out.println("Booking Canceled");

        sc.close();
    }
}