import java.util.Scanner;

public class assignment5{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.print("Enter 3 numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if(x > y && x > z){
            System.out.println("Largest is " + x);
        } 
        else if(y > x && y > z){
            System.out.println("Largest is " + y);
        }
         else{
            System.out.println("Largest is " + z);
        }
    }
}