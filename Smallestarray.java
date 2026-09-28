public class Smallestarray {
    public static void main(String[] args) {

        int[] arr = {10, 25, 15, 40, 30};
        int min = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] < min){
            
                min = arr[i];
            }
        }

        System.out.println("Smallest is " + min);
    }
}

