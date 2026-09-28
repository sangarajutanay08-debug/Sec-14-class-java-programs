public class EvenArray{
    public static void main(String[] args){

        int[] arr = {10,11,12,13,14};

        System.out.println("Even elements are: ");

        for(int i=0; i<arr.length; i++){

            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
    
}
