public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        this.height = h;
        this.width=w;
    }

    @Override
    public double calculateArea(){
        return height*width;
    }

    @Override
    public void displayInfo(){
        System.out.println("Shape: Rectangle, height: "+height+", width: "+width+", area: "+this.calculateArea()+".");
    }


}