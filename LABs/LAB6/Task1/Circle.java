public class Circle extends Shape {
    private double radius;

    public Circle(double r){
        this.radius = r;
    }

    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public void displayInfo(){
        System.out.println("Shape: Circle, radius: "+radius+", area: "+this.calculateArea()+".");
    }
}