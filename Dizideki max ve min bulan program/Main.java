public class Main {
    public static void main(String[] args) {
        int[] arr = {56,34,1,8,101,-2,-33};


        int min = arr[0];
        int max = arr[0];

        for (int i = 0 ; i < arr.length ; i++){
            if (max<arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum value :"+min);
        System.out.println("Maximum value : "+max);



    }
}
