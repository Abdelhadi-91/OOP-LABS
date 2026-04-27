import java.util.ArrayList;

public class University {
    private ArrayList<Person> people;

    public University() {
        this.people = new ArrayList<>();
    }

    public void addPerson (Person p ){
        people.add(p);
    }

    public void showAll(){
        for (Person person : people) {
            System.out.println("--------------------");
            person.displayInfo();
        }
    }

}
