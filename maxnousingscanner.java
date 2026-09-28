import java.util.Scanner;
public class maxnousingscanner{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value");
        int a = scanner.nextInt();
        System.out.print("Enter b value");
        int b = scanner.nextInt();

        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }


    }
}
