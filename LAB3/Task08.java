import java.util.Scanner;

public class Task08 {

    static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }

    static int reverseNumber(int n) {
        // Base case: correctly handles when n is 0, or when we reach the last digit
        if (n / 10 == 0) return n; 
        int digits = (int) Math.log10(n / 10) + 1;
        return (n % 10) * (int) Math.pow(10, digits) + reverseNumber(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for a non-negative integer
        System.out.print("Enter a non-negative integer n: ");
        int n = scanner.nextInt();

        System.out.println("\nResults");
        // Outputting the sum of digits and the reversed number
        System.out.println("Sum of digits: " + sumDigits(n));
        System.out.println("Reversed number: " + reverseNumber(n));

        scanner.close();
    }
}