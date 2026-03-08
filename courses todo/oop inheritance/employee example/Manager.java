public class Manager extends Employee {
    double bonus;

    public Manager(String name, double baseSalary, double bonus){
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public String infos() {
        return super.infos()+" bonus: "+bonus;
    }

    public static void main(String[] args) {
        Employee khadam = new Employee("Hmida", 10);
        Manager boss = new Manager("Abdelhadi", 50, 20);
        System.out.println(boss.infos());
        System.out.println(khadam.infos());
    }
}
