import java.util.Scanner;
public class Pracelweight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter parcel weight: ");
            double weight=
              Double.parseDouble(sc.nextLine());
              System.out.println("weight accepted: "+ weight+ "kg");
        }
        catch (NumberFormatException e) {

            System.out.println("Invalid weight" + " please enter a number");
        }
        finally {
            System.out.println("weight checking completed");
        }
        sc.close();
    }
}