public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("theZoo");
        Animal lion = new Lion(0, "simba", 15, 2.5, "ba3ba3");
        Animal parrot = new Parrot(1, "samet", 4, 0.5, 50);
        zoo.addAnimal(lion);
        zoo.addAnimal(parrot);
        zoo.printAnimals();
    }
}