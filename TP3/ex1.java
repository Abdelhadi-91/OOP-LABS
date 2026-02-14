import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.isEmpty()) {
            System.out.println("The string is empty");
        } else {
            int i = 0;
            String new_str = "";
            while (i < str.length()) {
                char x = str.charAt(i);
                int count = 1;
                while (i<str.length() -1 && str.charAt(i + 1) ==x) {
                    count++;
                    i++;
                }
                i++;
                String count_string = String.valueOf(count);
                new_str += x + count_string;
            }
            System.out.println(new_str);
        }
        scanner.close();
    }
}
