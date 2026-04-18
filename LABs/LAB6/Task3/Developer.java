public class Developer extends Employee {
    int overtimeHours;
    double hourRate;

    public Developer(String name, double baseSalary, int overtimeHours, double hourRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.hourRate = hourRate;
    }

    @Override
    public double calculateSalary(){
        return baseSalary + overtimeHours*hourRate;
    }

    @Override
    public void displayInfo(){
        System.out.println("name: "+name+", grade: developer, salary: "+this.calculateSalary());
    }

    
}
