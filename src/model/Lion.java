package model;

import visitor.AnimalVisitor;

public class Lion implements Animal{

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
