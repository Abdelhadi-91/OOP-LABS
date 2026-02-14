import java.util.Scanner;

public class EXO3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        double value,converted_value;

        System.out.println("Choose an option from 1 to 4 :");
        System.out.println("1 - Celsius -> Fahrenheit");
        System.out.println("2 - Fahrenheit -> Celsius");
        System.out.println("3 - Kilometers -> Miles");
        System.out.println("4 - Miles -> Kilometers");

        a = scanner.nextInt();

        switch (a) {
            case 1:
                System.out.print("Enter a value : ");
                value = scanner.nextInt();
                converted_value = (value*9.0/5.0) + 32;
                System.out.printf("%.2f Celsuis = %.2f Fahrenheit",value,converted_value);
                break;
            case 2:
                System.out.print("Enter a value : ");
                value = scanner.nextInt();
                converted_value = (value-32) *5.0/9.0;
                System.out.printf("%.2f Fahrenheit = %.2f Celsuis",value,converted_value);
                break;
            case 3:
                System.out.print("Enter a value : ");
                value = scanner.nextInt();
                converted_value = value*0.621371;
                System.out.printf("%.2f Kilometers = %.2f Miles",value,converted_value);
                break;
            case 4:
                System.out.print("Enter a value : ");
                value = scanner.nextInt();
                converted_value = value/0.621371;
                System.out.printf("%.2f Miles = %.2f Kilometers",value,converted_value);
                break;
            default:
                System.out.println("You must inter an integer in this range (1;4)");
        }

        scanner.close();
    }
}
