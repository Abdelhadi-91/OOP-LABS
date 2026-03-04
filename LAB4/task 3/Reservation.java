public class Reservation {
    String studentName;
    TimeSlot slot;

    public Reservation(String studentName, TimeSlot slot) {
        this.studentName = studentName;
        this.slot = slot;
    }

    public String summary() {
        return studentName + " reserved " + slot.toString(); 
    }
}
