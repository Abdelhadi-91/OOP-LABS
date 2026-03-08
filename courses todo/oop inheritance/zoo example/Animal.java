public class Animal extends Zoo {
    int id;
    String name;
    int age;
    double dailyFoodKg;

    public Animal(int id, String name, int age, double dailyFoodKg) {
        super(name);
        this.id = id;
        this.name = name;
        this.age = age;
        this.dailyFoodKg = dailyFoodKg;
    }

    public int getId() {
        return id;
    }

    public double getDailyFoodKg() {
        return dailyFoodKg;
    }

    public String info() {
        return "id: "+id+", name: "+name+", age: "+age+", daily food: "+String.format("%.2f", dailyFoodKg)+"Kg.";
    }
}
