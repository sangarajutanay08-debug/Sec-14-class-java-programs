import java.util.Scanner;
public class mixedincrement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value");
        int a = sc.nextInt();
        System.out.print("Enter b value");
        int b = sc.nextInt();
        int z  = a++ + ++b *2;
        System.out.println(z);
        
    }
}