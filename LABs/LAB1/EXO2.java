public class EXO2 {
    public static void main(String[] args) {
        int a, b, c, d, n;
        String statue;
        n = Integer.parseInt(args[0]);

        if (n > 999 && n < 10000) {
            a = n / 1000; // 1234
            b = (n / 100) % 10;
            c = (n / 10) % 10;
            d = n % 10;
            if (a + d == b + c && d % 2 == 0) {
                statue = "VALID";
            } else {
                statue = "INVALID";
            }
            System.out.println(statue);
        } else {
            System.out.println("n must be in range (1000;9999)");
        }
    }
}
