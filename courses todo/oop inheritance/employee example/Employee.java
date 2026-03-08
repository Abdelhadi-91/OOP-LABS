public class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String infos() {
        return "name: "+name+", base salary: "+baseSalary+".";
    }

}
