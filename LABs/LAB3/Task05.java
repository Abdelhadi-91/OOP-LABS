import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter R: ");
        int R = scanner.nextInt();
        System.out.print("Enter C: ");
        int C = scanner.nextInt();
        int[][] table = new int[R][C];
        System.out.println("---------------------------------------------");
        System.out.println("Now enter values");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print("array["+i+"]"+"["+j+"] = ");
                table[i][j] = scanner.nextInt();
            }
        }
        System.out.println("---------------------------------------------");
        int totalSum = 0;

        // Row sums
        for (int i = 0; i < R; i++) {
            int rowSum = 0;
            for (int j = 0; j < C; j++) {
                rowSum += table[i][j];
            }
            System.out.println("Row " + i + " sum: " + rowSum);
            totalSum += rowSum;
        }
        System.out.println("---------------------------------------------");
        // Column sums
        for (int j = 0; j < C; j++) {
            int colSum = 0;
            for (int i = 0; i < R; i++) {
                colSum += table[i][j];
            }
            System.out.println("Column " + j + " sum: " + colSum);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Total sum: " + totalSum);

        scanner.close();
    }
}
