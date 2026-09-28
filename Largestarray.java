public class Largestarray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 45, 50};
        int max = arr[0];

        for (int i = 1; i < 5; i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Largest is " + max);
    }
}

