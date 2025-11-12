package builder;
import model.*;

public interface AnimalBuilder {
    AnimalBuilder setName (String name);
    AnimalBuilder setAge (int age);
    AnimalBuilder setWeight (double weight);
    Animal build();
}
