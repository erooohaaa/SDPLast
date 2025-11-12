package model;

import visitor.AnimalVisitor;

public class Wolf implements Animal {
    @Override
    public void accept (AnimalVisitor visitor){
        visitor.visit(this);
    }

}
