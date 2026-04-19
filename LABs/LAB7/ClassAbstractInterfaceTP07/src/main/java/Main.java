import classes.SalesPerson;
import classes.Developer;
import classes.Tester;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("--- Testing SalesPerson ---");
        // 1. Create an instance of the SalesPerson class and set its properties
        SalesPerson salesPerson = new SalesPerson("Amine", 30, 101, 5000, 10000.0);
        
        // Print its details information 
        salesPerson.printDetails(); 
        
        // 2. Call the calculateBonus method and print it
        double salesBonus = salesPerson.calculateBonus();
        System.out.println("SalesPerson Bonus: " + salesBonus);
        
        // 3. Call the approveLeave method
        salesPerson.approveLeave("Ahmed");

        
        System.out.println("\n--- Testing Developer ---");
        // 7. Create an instance of the Developer class
        Developer developer = new Developer("Sarah", 27, 102, 6000, 4);
        
        // Call Developer methods
        developer.printDetails();
        System.out.println("Developer Bonus: " + developer.calculateBonus());

        
        System.out.println("\n--- Testing Tester ---");
        // 7. Create an instance of the Tester class
        Tester tester = new Tester("Karim", 24, "E-commerce Platform");
        
        // Call Tester methods
        tester.approveLeave("Sarah");
    }
}