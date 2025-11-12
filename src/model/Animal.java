package model;
import visitor.AnimalVisitor;

public interface Animal {
    void accept(AnimalVisitor visitor);
}