public class Vehicle {

    String regNo;
    String marke;
    String type;
    int yearOfManif;
    double value;

    public Vehicle(String regNo, String marke, String type, int yearOfManif, double value) {
        this.regNo = regNo;
        this.marke = marke;
        this.type = type;
        this.yearOfManif = yearOfManif;
        this.value = value;
    }

    public int calculateAge(int currentYear) {
        return currentYear - yearOfManif;
    }

    public int getYear() {
        return yearOfManif;
    }

    public void setValue(double newValue) {
        value = newValue;
    }

    public static void main(String[] args) {
        Vehicle congo = new Vehicle("1","Cetroine","Van",2009,150);
        congo.setValue(160);
        System.out.println(congo.value);
        System.out.println(congo.calculateAge(2026));
    }
}
