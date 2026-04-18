public class Main {
    public static void main(String[] args) {
        Shape[] array = new Shape[2];
        Shape c = new Circle(5);
        Shape r = new Rectangle(2, 4);

        array[0]=c;
        array[1]=r;

        for (int i = 0; i < array.length; i++) {
            array[i].displayInfo();
        }
    }
}
