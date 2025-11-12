package collection;
import model.*;
import visitor.*;
import java.util.*;

public class ZooCollection {
    private List<Animal> animals = new ArrayList<>();
    public void addAnimal(Animal animal){animals.add(animal);}
    public void acceptAll(AnimalVisitor visitor){
        for(Animal animal : animals){
            animal.accept(visitor);
        }
    }
}
