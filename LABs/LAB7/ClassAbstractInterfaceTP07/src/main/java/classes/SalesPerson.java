package classes;

import abstractClasses.Employee;
import interfaces.Manager;

public class SalesPerson extends Employee implements Manager{
    private double salesAmount;

    public SalesPerson(String name, int age, int employeeId,int salary, double salesAmount) {
        super(employeeId, salary, name, age);
        this.salesAmount = salesAmount;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }
    
    @Override
    public double calculateBonus(){
        return salesAmount *0.1;
    }
    
    public void approveLeave(String employeeName){
        System.out.println("Leave approved for employee "+employeeName);
    }
    
    
    
    
}