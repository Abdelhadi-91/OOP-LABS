import java.util.Scanner;

public class EXO6 {
    public static void main(String[] args) {
        System.out.print("");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N (N>0): ");
        int N = scanner.nextInt();
        int somme = 0;
        int count = 0;
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                int x = scanner.nextInt();
                if (x < 0) {
                    continue;
                }
                if (x == 999) {
                    break;
                }
                somme += x;
                count++;
            }
            System.out.println("Sum = " + somme);
            System.out.println("Count = " + count);
        } else {
            System.out.println("N must be greater than 0");
        }
        scanner.close();
    }
}
