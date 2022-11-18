import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Girilen sayıdan küçük ve büyük en yakın sayıyı bulan program

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lenght of array :  ");
        int lenght = input.nextInt();
        Random random = new Random();
        int[] arr = new int[lenght];

        for (int i = 0 ; i < arr.length;i++){
            System.out.print("Enter a element of array : ");
            arr[i] = input.nextInt();
        }

        // Kullanıcıdan değer aldım
        System.out.print("\n\nEnter a value : ");
        int n = input.nextInt();
        int min = arr[0], max = arr[0];
        int temp;

        // Diziyi sıraladım küçükten büyüğe sıradım
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j]; // 15
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("\n\nArray sıralanmış hali : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int j : arr) {
            if (j < n) {
                min = j;
            }
            if (j > n) {
                max = j;
                break;
            }
        }
        System.out.println("\n\nMin value : " + min);
        System.out.println("Max value : " + max);


    }
}
