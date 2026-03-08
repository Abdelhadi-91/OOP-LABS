import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting for the dimensions and the target block
        System.out.print("Enter R (number of rows): ");
        int R = scanner.nextInt();
        
        System.out.print("Enter C (number of seats per row): ");
        int C = scanner.nextInt();
        
        System.out.print("Enter K (number of consecutive available seats needed): ");
        int K = scanner.nextInt();
        
        int[][] seats = new int[R][C];

        // Prompting for the seating matrix with lab instructions
        System.out.println("\nEnter the seating matrix:");
        System.out.println("(Remember: 0 means available, 1 means taken)");
        
        for (int i = 0; i < R; i++) {
            System.out.print("Enter " + C + " values (0 or 1) for row " + i + ": ");
            for (int j = 0; j < C; j++) {
                seats[i][j] = scanner.nextInt();
            }
        }

        boolean found = false;

        System.out.println("\nResults");
        // Searching for K consecutive empty seats
        for (int i = 0; i < R && !found; i++) {
            int consecutive = 0;
            for (int j = 0; j < C; j++) {
                if (seats[i][j] == 0) { // 0 means available
                    consecutive++;
                    if (consecutive == K) {
                        int startCol = j - K + 1;
                        System.out.println("Row = " + i + ", StartSeat = " + startCol);
                        found = true;
                        break;
                    }
                } else {
                    consecutive = 0; // Reset if a taken seat (1) is found
                }
            }
        }

        if (!found) {
            System.out.println("No block found");
        }

        scanner.close();
    }
}