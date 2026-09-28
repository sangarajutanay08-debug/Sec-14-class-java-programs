import java.util.Scanner;

public class assignment11{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    
            int n1;
            int i1=1;

            System.out.print("Enter a number: ");
            n1 = sc.nextInt();

            while(i1<=10){
            System.out.println(n1 + " x " + i1 + " = " + (n1*i1));
            i1++;
            }
        }
    }
    
