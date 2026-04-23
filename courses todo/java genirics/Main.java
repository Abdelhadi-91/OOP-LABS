public class Main {
    public static void main(String[] args) {

        Pair<Integer> intPair = new Pair<>(10, 20);
        System.out.println("Initial Integer Pair:");
        intPair.printPair();

        intPair.swap();
        System.out.println("After swap:");
        intPair.printPair();

        System.out.println("Are equal? " + intPair.isEqual());
        
        Pair<String> strPair = new Pair<>("hello", "hello");
        System.out.println("Initial String Pair:");
        strPair.printPair();

        System.out.println("Are equal? " + strPair.isEqual());
        
        strPair.setSecond("world");
        System.out.println("After modifying second:");
        strPair.printPair();
        System.out.println("Are equal now? " + strPair.isEqual());
        
    }
}