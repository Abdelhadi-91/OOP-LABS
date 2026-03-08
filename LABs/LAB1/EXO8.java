import java.util.Scanner;

public class EXO8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();
        System.err.println("JAwad artiste");
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
        scanner.close();
    }
}

