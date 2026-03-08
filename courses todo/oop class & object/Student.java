public class Student {
    String name;
    int age;
    String phoneNumber;

    public Student(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void printInfos() {
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Student phone number: "+phoneNumber);
    }

    public static void main(String[] args) {
        Student hmida = new Student("Hmida", 22, "054938418");
        hmida.printInfos();
    }
}
