package model;

import visitor.AnimalVisitor;

public class Wolf implements Animal {
    private String name;
    private int age;
    private double weight;
    public Wolf() {}
    public Wolf(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    @Override
    public void accept (AnimalVisitor visitor){
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return name + " (age " + age + ", " + weight + " kg)";
    }
}
