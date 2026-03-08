public class Main {
    public static void main(String[] args) {
        Vehicle accent = new Taxi("8080", 170, 0, false, 2);
        System.out.println(accent.info());
        accent.accelerate(20);
        System.out.println(accent.info());
        accent.brake(10);
        System.out.println(accent.info());
    }
}
