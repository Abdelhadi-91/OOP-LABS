public class Parrot extends Animal {
    int vocabularySize;

    public Parrot(int id, String name, int age, double dailyFoodKg, int vocabularySize) {
        super(id, name, age, dailyFoodKg);
        this.vocabularySize = vocabularySize;
    }

    public String info() {
        return super.info()+", vocabulary size: "+vocabularySize;
    }
}
