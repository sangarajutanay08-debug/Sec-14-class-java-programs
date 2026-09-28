import java.util.Scanner;
public class Theatreshowticket{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter the Number of tickets: ");
        int numberOfTickets = sc.nextInt();

        System.out.print("Enter the ticket price: ");
        double price = sc.nextDouble();

        System.out.print("Seat availability? true : false: ");
        boolean seatAvailability = sc.nextBoolean();

        double totalAmount = numberOfTickets * price;

        System.out.println("Customer Name: " + customerName);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Ticket Price: " + price);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Seat Availability: " + seatAvailability);
    }
}