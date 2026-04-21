import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person> {
    String name;
    int id;
    double gpa;

    public Person(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.gpa, other.gpa );

    }

    public static void main(String[] args) {
        Person s1 = new Person("Ahmed", 0, 10);
        Person s2 = new Person("Ali", 1, 7);
        Person s3 = new Person("Omar", 2, 14);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);

        Collections.sort(persons);

        for (Person person : persons) {
            System.out.println(person.name+", gpa: "+person.gpa);
        }

        

    }
}
