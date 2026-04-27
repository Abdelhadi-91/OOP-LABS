public class Main {
    public static void main(String[] args) {
        Payable p1 = new Student("Ahmed", 19, 2000.0);
        Payable p2 = new Teacher("Oussama", 36, 5000.0);

        System.out.println(p1.calculatePayment());
        System.out.println(p2.calculatePayment());
        
        Person p3 = new Student("Abdelhadi", 20, 2000);
        p3.displayInfo();

        University u = new University();
        Person p4 = new Teacher("Simoh", 99, 9999);
        
        u.addPerson(p3);
        u.addPerson(p4);
        u.showAll();
    }
}
