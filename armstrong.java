import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enetr a value ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        while(num>0) {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num /= 10;
        }

        if (sum == num){
            System.out.println("it is a armstrong number");
        }
        else{
            System.out.println("it is not a armstrong number");
        }
        sc.close();
    }
}
