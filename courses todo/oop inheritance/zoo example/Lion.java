public class Lion extends Animal {
    String prideName;

    public Lion(int id, String name, int age, double dailyFoodKg, String prideName) {
        super(id, name, age, dailyFoodKg);
        this.prideName = prideName;
    }

    public String info() {
        return super.info()+", pride name: "+prideName;
    }
}
