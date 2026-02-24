import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int right = 0;
        int left = 0;

        System.out.print("Enter text: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='(') {
                left++;
            } else if (str.charAt(i)==')') {
                right++;
            }
        }

        if (right==left) {
            System.out.println("BALANCED");
        } else {
            System.out.println("NOT BALANCED");
        }

        scanner.close();
    }
}
