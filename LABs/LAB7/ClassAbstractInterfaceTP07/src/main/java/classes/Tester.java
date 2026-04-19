package classes;

import interfaces.Manager;

public class Tester implements Manager{
    private String name;
    private int age;
    private String project;

    public Tester(String name, int age, String project) {
        this.name = name;
        this.age = age;
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProject() {
        return project;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public void approveLeave(String employeeName) {
        System.out.println("Leave approved for employee "+employeeName);
    }
    
    
}