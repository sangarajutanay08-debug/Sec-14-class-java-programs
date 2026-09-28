import java.util.Scanner;
public class Hotelroombooking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter room type (1-Standard, 2-Deluxe, 3-Suite): ");
        int roomtype = sc.nextInt();
        System.out.print("Enter number of days: ");
        int  staydays = sc.nextInt();
        System.out.print("Enter number of rooms: ");
        int numrooms = sc.nextInt();

        double roomprice = 0;
        String roomname = "";

        switch(roomtype){
            case 1:
            roomname = "Standard";
            roomprice = 2500;
            break;
            case 2:
            roomname = "Deluxe";
            roomprice = 3500;
            break;
            case 3:
            roomname = "Suite";
            roomprice = 5700;
            break; 
            default:
            System.out.println("Not ont the list");
        }
        double totalAmount = roomprice * staydays * numrooms;
        String membership = "";

        if(totalAmount <= 5000){
            membership = "Basic";
        }
        else if(totalAmount > 5000 && totalAmount <= 10000){
                membership = "Silver";
        }
        else if(totalAmount > 10000 && totalAmount <= 15000){
                membership = "Gold";
        }
        else {
                membership = "Platinum";
        }
        
        System.out.println(roomname);
        System.out.println("Membership: " + membership);
        System.out.println("Total Amount: " + totalAmount);
        
    }
}
    

