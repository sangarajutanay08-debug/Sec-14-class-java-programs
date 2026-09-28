public class Arraysstudentmarks{
    public static void main(String[] args){

        int[] marks = {90, 80, 70, 60, 69};
        System.out.println("Student Marks: ");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        int search = 80;
        for(int i=0; i<marks.length; i++){
            if(marks[i] == search){
                System.out.println("80 found at index: " + i);
            }
        }

        int count = 0;
        for(int i=0; i<marks.length; i++){
            if (marks[i]>=50){
                count++;
            }
        }
        System.out.println("Number of students passed is: " + count);
        
        int highest = marks[0];
        int lowest = marks[0];
        for(int i=0; i<marks.length; i++){
            if(marks[i] > highest){
                highest = marks[i];
            }
            if(marks[i] < lowest){
                lowest = marks[i];
            }
        }
        System.out.println("Highest marks: " + highest);
        System.out.println("Lowest marks: " + lowest);
    }
}