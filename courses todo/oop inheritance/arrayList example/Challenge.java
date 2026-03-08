import java.util.ArrayList;

public class Challenge {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("green");
        colors.add("orange");
        colors.add("white");
        colors.add("black");
        System.out.println(colors);
        colors.add(0, "red");
        System.out.println(colors);
        colors.set(1, "white");
        System.out.println(colors);
    }

}
