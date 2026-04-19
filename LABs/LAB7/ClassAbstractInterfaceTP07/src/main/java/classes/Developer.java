package classes;

import abstractClasses.Employee;

public class Developer extends Employee{
    private int experiance;
    
    public Developer(String name, int age, int employeeId, int salary, int experiance){
        super(employeeId, salary, name, age);
        this.experiance = experiance;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }
    
    @Override
    public double calculateBonus(){
        return salary * experiance*0.1;
    }
}