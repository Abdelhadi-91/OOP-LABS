public class StudyRoom {
    String roomName;
    Reservation[] reservations;
    int size;

    public StudyRoom(String roomName, int max) {
        this.roomName = roomName;
        this.reservations = new Reservation[max];
        this.size = 0;
    }

    public boolean reserve(String student, TimeSlot slot) {
        if (size >= reservations.length) {
            System.out.println("error: room is full");
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (reservations[i].slot.overlaps(slot)) {
                System.out.println("error: overlaps");
                return false;
            }
        }
        reservations[size] = new Reservation(student, slot);
        size++;
        return true;
    }

    public void printSchedule(int day) {
        for (int i = 0; i < size; i++) {
            if (reservations[i].slot.day == day) {
                System.out.println(reservations[i].summary());
            }
        }
    }

    public static void main(String[] args) {
        StudyRoom room = new StudyRoom("room 1", 10);

        TimeSlot t1 = new TimeSlot(1, 9, 11);
        room.reserve("Abdelhadi", t1);
        TimeSlot t2 = new TimeSlot(1, 11, 13);
        room.reserve("Rayane", t2);
        TimeSlot t3 = new TimeSlot(1, 10, 12);
        room.reserve("Akram", t3);
        room.printSchedule(1);
    }
}
