import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' ') {
                System.err.println();
            } else {
                System.out.print(str.charAt(i));
            }
        }
        scanner.close();
    }
}
