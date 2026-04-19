public class Manager extends Employee {
    double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    

    @Override
    public double calculateSalary() {
        return baseSalary +bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("name: "+name+", grade: manager, salary: "+this.calculateSalary());
    }
}
