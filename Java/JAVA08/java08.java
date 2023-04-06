package Java.JAVA08;
import java.util.Scanner;

public class java08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la valeur de n : ");
        int n = scanner.nextInt();

        int[] primes = new int[n];
        int count = 0;

        for (int num = 2; count < n; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes[count] = num;
                count++;
            }
        }
        
        System.out.println("Les " + n + " premiers nombres premiers sont : ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}