import java.util.Scanner;

public class divisibleby3or5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("It is divisible by both 3 and 5");
        } else if (n % 3 == 0) {
            System.out.println("It is divisible by 3");
        } else if (n % 5 == 0) {
            System.out.println("It is divisible by 5");
        } else {
            System.out.println("It is not divisible by 3 or 5");
        }
    }
}
