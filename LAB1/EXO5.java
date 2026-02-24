import java.util.Scanner;

public class EXO5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somme = 0;
        int count = 0;
        int x = scanner.nextInt();
        if (x==0) {
            System.out.println("NO DATA");
        } else {
            while (true) {
                if (x==0) {
                    break;
                }
                somme += x;
                count++;
                x = scanner.nextInt();
            }
            System.err.println("Somme = "+somme);
            System.out.println("Count = "+count);
            double average = somme / count;
            System.out.printf("Average = %.2f",average);
        }
        scanner.close();
    }
}
