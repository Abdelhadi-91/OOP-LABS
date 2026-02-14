public class EXO9 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java EXO9 width height");
            return;
        }
        
        double width = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        
        double area = width * height;
        double perimeter = 2 * (width + height);
        
        String classification;
        if (width==height) {
            classification = "Square";
        } else {
            classification="Rectangle";
        }
        
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Classification: " + classification);
    }
}
