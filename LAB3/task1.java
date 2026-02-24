import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int max = 0;
        int min = 0;
        int even = 0;
        int sum = 0;
        double avg;
        System.out.print("Enter the array length: ");
        int N = scanner.nextInt();
        array = new int[N];
        if (N > 0) {
            System.out.println("Now enter arrays values");
            for (int i = 0; i < N; i++) {
                System.out.print("array[" + i + "] = ");
                array[i] = scanner.nextInt();
                sum += array[i];
                if (i == 0) {
                    max = array[i];
                    min = array[i];
                } else {
                    if (array[i] > max) {
                        max = array[i];
                    }
                    if (array[i] < min) {
                        min = array[i];
                    }
                }
                if (array[i] % 2 == 0) {
                    even++;
                }
            }
            avg = (double) sum / N;
            System.out.println("-----------------------------------------");
            System.out.println("array = " + Arrays.toString(array));
            System.err.println("Sum = " + sum);
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
            System.out.printf("Average = %.2f", avg);
            System.out.println();
            System.out.println("Count of even numbers = " + even);
        } else {
            System.out.println("Length must be greater than 0");
        }
        scanner.close();
    }
}