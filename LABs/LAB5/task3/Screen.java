public class Screen {
    int screenNumber;
    int capacity;

    public Screen(int screenNumber, int capacity) {
        this.screenNumber = screenNumber;
        this.capacity = capacity;
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public String info() {
        return "number: " + screenNumber + ", capacity: " + capacity;
    }

}
