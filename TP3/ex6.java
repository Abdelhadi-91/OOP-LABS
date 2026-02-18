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
            System.out.println("REJECTED - Cause 1");
        } else if (!upper) {
            System.out.println("REJECTED - Cause 2");
        } else if (!lower) {
            System.out.println("REJECTED - Cause 3");
        } else if (!digit) {
            System.out.println("REJECTED - Cause 4");
        } else if (!special) {
            System.out.println("REJECTED - Cause 5");
        } else if (space) {
            System.out.println("REJECTED - Cause 6");
        } else if (repeat) {
            System.out.println("REJECTED - Cause 7");
        } else {
            System.out.println("ACCEPTED");
        }

        scanner.close();
    }
}
