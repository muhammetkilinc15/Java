import javax.naming.PartialResultException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dizideki elemanların ortalamasını bulan pprogram
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        // Kullanıcıdan dizinin uzunluğu kaç olmalı sordum
        System.out.print("Enter a length of array :");
        int length = input.nextInt();
        int [] numbers = new int[length];
        // Uzunluğu belli diziye içine ( -100,100 ) random sayı atadım
        for (int i = 0 ; i < numbers.length ; i++)
        {
            int randomNumber = random.nextInt(-100,10);
            numbers[i] = randomNumber;
        }
        // dizinin elemanlarını ekrana yazdırdım
        System.out.println("Array's elements : ");
       for (int i = 0; i< numbers.length;i++){
           System.out.print(numbers[i]+ " ");
       }
        int sum = 0;
        for (int i = 0; i<numbers.length;i++){
            sum+= numbers[i];
        }
        // ortalamayı ekrana yazdırdım
        double average = (double) sum / numbers.length;
        System.out.print("\nAverage : "+average);

    }
}
