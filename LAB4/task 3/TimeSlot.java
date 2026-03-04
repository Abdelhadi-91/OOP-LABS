public class TimeSlot {
    int day;
    int startHour;
    int endHour;  

    public TimeSlot(int day, int startHour, int endHour) {
        if (startHour >= endHour) {
            System.out.println("Error: Start time must be before end time.");
        }
        this.day = day;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public boolean overlaps(TimeSlot other) {
        if (this.day != other.day) {
            return false;
        }
        return this.startHour < other.endHour && this.endHour > other.startHour;
    }

    public String toString() {
        return "Day " + day + " (" + startHour + ":00 - " + endHour + ":00)";
    }
}