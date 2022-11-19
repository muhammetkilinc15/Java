import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += 1.0 / arr[i];
        }
        float hormonicAverage = arr.length / sum;
        System.out.println("Average :  " + hormonicAverage);
    }
}
