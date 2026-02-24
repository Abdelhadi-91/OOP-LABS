public class basicSyntax {
    public static void main(String[] args) {
        int number = 10;
        double decimal = 5.5;

        String text = "Java is fun!";
        System.out.println("Number: "+number);
        System.out.println("Decimal: "+decimal);
        System.out.println("Text: "+text);

        int sum = number + (int) decimal;
        System.out.println("Sum: "+sum);

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop interation: "+i);
        }

        boolean isGreaterThanFive = (number > 5);

        if (isGreaterThanFive) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is 5 or less");
            System.out.println();
        }
    }
}
