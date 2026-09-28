import java.util.Scanner; 
public class assignment1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter temperature value in centigrade ");
      double temp = sc.nextDouble();

      if (temp >= 0 && temp <= 10) {
         System.out.print("Very Cold weather");
      }
      else if (temp >=10 && temp <= 20){
        System.out.print("cold weather");
      }
      else if (temp>=20 && temp<=30){
        System.out.print("normal temperature");
      }
      else if (temp>=30 && temp <=40){
        System.out.print(" its hot ");
      }
      else {
            System.out.print(" its very hot");
        }
      sc.close();
   }
}