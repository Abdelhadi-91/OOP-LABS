import java.util.Scanner;

public class EXO4 {
    public static void main(String[] args) {
        int c200, c100, c50, c20, c10, c5, c2, c1, amount;
        c200 = 0;
        c100 = 0;
        c50 = 0;
        c20 = 0;
        c10 = 0;
        c5 = 0;
        c2 = 0;
        c1 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount in the range [0;9999]: ");
        amount = scanner.nextInt();

        if (amount >= 0 && amount <= 9999) {
            while (amount != 0) {
                if (amount >= 200) {
                    c200++;
                    amount -= 200;
                } else if (amount >= 100) {
                    c100++;
                    amount -= 100;
                } else if (amount >= 50) {
                    c50++;
                    amount -= 50;
                } else if (amount >= 20) {
                    c20++;
                    amount -= 20;
                } else if (amount >= 10) {
                    c10++;
                    amount -= 10;
                } else if (amount >= 5) {
                    c5++;
                    amount -= 5;
                } else if (amount >= 2) {
                    c2++;
                    amount -= 2;
                } else {
                    c1++;
                    amount -= 1;
                }
            }
            System.err.println("200c = " + c200);
            System.err.println("100c = " + c100);
            System.err.println("50c = " + c50);
            System.err.println("20c = " + c20);
            System.err.println("10c = " + c10);
            System.err.println("5c = " + c5);
            System.err.println("2c = " + c2);
            System.err.println("1c = " + c1);
        } else {
            System.err.println("Enter a valid amount");
        }
        scanner.close();
    }
}
