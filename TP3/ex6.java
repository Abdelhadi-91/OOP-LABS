import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String str = scanner.nextLine();

        boolean len = str.length() >= 8 && str.length() <= 16;
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;
        boolean space = false;
        boolean repeat = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upper = true;
                break;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lower = true;
                break;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digit = true;
                break;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '@' ||
                    str.charAt(i) == '#' ||
                    str.charAt(i) == '$' ||
                    str.charAt(i) == '%' ||
                    str.charAt(i) == '!') {
                special = true;
                break;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                space = true;
                break;
            }
        }

        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i + 1) == str.charAt(i) &&
                    str.charAt(i + 2) == str.charAt(i)) {
                repeat = true;
                break;
            }
        }

        if (!len) {
            System.out.println("REJECTED - Length is between 8 and 16 (inclusive)");
        } else if (!upper) {
            System.out.println("REJECTED - Contains at least one uppercase letter (A–Z)");
        } else if (!lower) {
            System.out.println("REJECTED - Contains at least one lowercase letter (a–z)");
        } else if (!digit) {
            System.out.println("REJECTED - Contains at least one digit (0–9)");
        } else if (!special) {
            System.out.println("REJECTED - Contains at least one special character from: @ # $ % !");
        } else if (space) {
            System.out.println("REJECTED - Must not contain a space");
        } else if (repeat) {
            System.out.println("REJECTED - Must not contain the same character repeated 3 times in a row");
        } else {
            System.out.println("ACCEPTED");
        }
    }
}
