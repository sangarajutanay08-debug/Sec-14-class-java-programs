import java.util.Scanner;

public class assignment4{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int marks1;
        int marks2;
        int marks3;
        int totalmarks;
        double average;

        System.out.print("Enter marks of 3 subjects ");
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
        totalmarks = marks1 + marks2 + marks3;
        average = totalmarks / 3.0;

        System.out.println("Total marks is " + totalmarks);
        System.out.println("Average is " + average);

        if (average >= 90){
            System.out.println("A");
        } 
        else if(average >= 80){
            System.out.println("B");
        } 
        else if(average >= 70){
            System.out.println("C");
        } 
        else if(average >= 60){
            System.out.println("D");
        } 
        else{
            System.out.println("E");
        }
    }
}