import java.util.Scanner;

public class ex2 {

    public static boolean isPlaindrome(String str,int start,int end) {
        while (start>end) {
            if (str.charAt(start)!=str.charAt(end)) {
                return false;
            }
            end--;
            start++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String long_str = "";
        int max_len = 0;

        System.out.print("Enter text: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (isPlaindrome(str,i,j)) {
                    if (j-i>max_len) {
                        max_len = j-i+1;
                        long_str = str.substring(i, j);
                    }
                }
            }
        }

        if (max_len==0) {
            System.out.println("No palindrome in the text");
        } else {
            System.out.println("Long palindrome: "+long_str);
            System.out.println("Length: "+max_len);
        }

        scanner.close();
    }
}
