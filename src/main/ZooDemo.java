package main;
import builder.*;
import collection.ZooCollection;
import model.*;
import visitor.*;
public class ZooDemo {
    public void run(){
        ZooCollection zoo = new ZooCollection();
        Animal lion = new LionBuilder()
                .setName("Simba")
                .setAge(5)
                .setWeight(190.5)
                .build();

        Animal monkey = new MonkeyBuilder()
                .setName("George")
                .setAge(3)
                .setWeight(35.2)
                .build();

        Animal wolf = new WolfBuilder()
                .setName("Akela")
                .setAge(7)
                .setWeight(80.7)
                .build();
        zoo.addAnimal(lion);
        zoo.addAnimal(monkey);
        zoo.addAnimal(wolf);
        AnimalVisitor cleaner = new Cleaner();
        AnimalVisitor trainer = new Trainer();
        AnimalVisitor vet = new Veterinarian();

        System.out.println("=== Cleaner visiting animals ===");
        zoo.acceptAll(cleaner);

        System.out.println("\n=== Trainer visiting animals ===");
        zoo.acceptAll(trainer);

        System.out.println("\n=== Veterinarian visiting animals ===");
        zoo.acceptAll(vet);
    }

}
