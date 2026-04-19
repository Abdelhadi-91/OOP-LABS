package abstractClasses;

import classes.Person;

public abstract class Employee extends Person{
    private int employeeId;
    protected int salary;

    public Employee(int employeeId, int salary, String name, int age) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public abstract double calculateBonus();
}