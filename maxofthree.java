import java.util.Scanner;
public class maxofthree{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enetr a value ");
        int a = scanner.nextInt();

        System.out.print("Enter b value ");
        int b = scanner.nextInt();

        System.out.print("Enter c value ");
        int c = scanner.nextInt();

        if(a>b && b>c){
            System.out.println(a);
        }
        else if(b>c && b>a){
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }

}
