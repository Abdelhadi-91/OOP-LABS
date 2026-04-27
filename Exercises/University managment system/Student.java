public class Student extends Person implements Payable {
    private double scholarship;

    public Student(String name, int age, double scholarship) {
        super(name, age);
        this.scholarship = scholarship;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        if (scholarship>=0) this.scholarship = scholarship;
    }

    @Override
    public String getRole(){
        return "Student";
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("role: "+this.getRole());
        System.out.println("scholarship: "+this.scholarship);
    }

    @Override
    public double calculatePayment(){
        return this.scholarship *1.15;
    }


    

}
