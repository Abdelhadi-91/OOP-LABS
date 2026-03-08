import java.util.Scanner;

public class Task07 {

    static boolean isSquare(int[][] m) {
        return m.length == m[0].length;
    }

    static int maxValue(int[][] m) {
        int max = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > max) max = m[i][j];
            }
        }
        return max;
    }

    static int sumMainDiagonal(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting for matrix dimensions
        System.out.print("Enter R (number of rows): ");
        int R = scanner.nextInt();
        
        System.out.print("Enter C (number of columns): ");
        int C = scanner.nextInt();
        
        int[][] matrix = new int[R][C];

        // Prompting for the matrix values
        System.out.println("\nEnter the matrix elements:");
        for (int i = 0; i < R; i++) {
            System.out.print("Enter " + C + " integers for row " + i + ": ");
            for (int j = 0; j < C; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n--- Results ---");
        // Outputting the results as requested by the task
        System.out.println("Square: " + isSquare(matrix));
        System.out.println("Max: " + maxValue(matrix));

        // Checking if we should calculate the diagonal sum
        if (isSquare(matrix)) {
            System.out.println("Diagonal sum: " + sumMainDiagonal(matrix));
        } else {
            System.out.println("No diagonal sum");
        }

        scanner.close();
    }
}