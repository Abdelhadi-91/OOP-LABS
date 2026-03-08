import java.util.ArrayList;

public class Zoo {
    String name;
    ArrayList<Animal> animals;

    public Zoo(String name){
        this.name = name;
        this.animals= new ArrayList<Animal>();
    }

    public boolean addAnimal(Animal a){
        if (a == null) {
            return false;
        }
        animals.add(a);
        return true;
    }

    public boolean removeAnimalById(int id){
        if (id>animals.size()-1) {
            return false;
        }
        animals.remove(id);
        return true;
    }

    public double totalDailyFoodKg() {
        double sum = 0;
        for (Animal animal : animals) {
            sum=+ animal.dailyFoodKg;
        }
        return sum;
    }

    public void printAnimals(){
        for(Animal animal: animals) {
            System.out.println(animal.info());
        }

}
}