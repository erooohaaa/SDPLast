package builder;
import model.*;
public class WolfBuilder implements AnimalBuilder {
    private String name;
    private int age;
    private double weight;
    @Override
    public AnimalBuilder setName(String Name)
    {
        this.name=Name;
        return this;
    }
    @Override
    public AnimalBuilder setAge(int age)
    {
        this.age=age;
        return this;
    }
    @Override
    public AnimalBuilder setWeight(double weight)
    {
        this.weight=weight;
        return this;
    }
    @Override
    public Animal build(){
        Wolf wolf = new Wolf();
        return wolf;
    }

}
