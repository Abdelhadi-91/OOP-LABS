public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 5000.0, 1200.0);
        Developer developer = new Developer("Bob", 4000.0, 15, 45.0);

        Employee[] employees = new Employee[]{manager, developer};

        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}