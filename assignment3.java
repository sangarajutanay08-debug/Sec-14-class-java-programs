import java.util.Scanner;

public class assignment3{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter traffic light colour ");
        char colour = sc.next().charAt(0);

        switch (colour){
            case 'R':
                System.out.println("The light is red. Stop.");
                break;
            case 'Y':
                System.out.println("The light is yellow. Prepare to stop.");
                break;
            case 'G':
                System.out.println("The light is green. Go.");
                break;

            default:
                System.out.println("Invalid input");
        }

        sc.close();
    }
}

