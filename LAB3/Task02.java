import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array length: ");
        int N = scanner.nextInt();
        if (N > 0) {
            int[] array = new int[N];
            System.out.println("---------------------------------------------");
            System.out.println("Now enter values");
            for (int i = 0; i < N; i++) {
                System.out.print("array[" + i + "] = ");
                array[i] = scanner.nextInt();
            }
            System.out.println("---------------------------------------------");
            System.out.print("Now enter K: ");
            int k = scanner.nextInt();
            k = k % N; // handle k >= N

            int[] shifted = new int[N];

            for (int i = 0; i < N; i++) {
                shifted[(i + k) % N] = array[i];
            }
            System.out.println("---------------------------------------------");
            System.out.println("Shifted array = " + Arrays.toString(shifted));
        }

        scanner.close();
    }
}
