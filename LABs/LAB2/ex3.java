import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String str = scanner.nextLine();

        System.out.print("K = ");
        int K = scanner.nextInt();

        String new_str = "";
        int new_char;

        for (int i = 0; i < str.length(); i++) {
            char old_char = str.charAt(i);

            if (old_char >= 'A' && old_char <= 'Z') {
                new_char = old_char + K;
                if (new_char > 'Z') {
                    new_char -= 26;
                }
            } else if (old_char >= 'a' && old_char <= 'z') {
                new_char = old_char + K;
                if (new_char > 'z') {
                    new_char -= 26;
                }
            } else {
                new_char = old_char;
            }
            new_str += (char) new_char;
        }
        
        System.out.println("New text: " + new_str);
        scanner.close();
    }
}
