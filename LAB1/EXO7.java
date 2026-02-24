import java.util.Scanner;

public class EXO7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            x = scanner.nextInt();
        } while (x<10 || x>50);
        System.out.println("The square of "+x+" is: "+x*x);
        scanner.close();
    }
}
