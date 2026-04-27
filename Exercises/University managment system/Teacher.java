public class Teacher extends Person implements Payable {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary>0) this.salary = salary;
    }

    @Override
    public String getRole() {
        return "Teacher";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("role: "+this.getRole());
        System.out.println("salary: "+salary);
    }

    @Override
    public double calculatePayment(){
        return this.salary* 0.95;
    }

    
}
