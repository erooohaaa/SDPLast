package model;

import visitor.AnimalVisitor;

public class Monkey implements Animal {

    @Override
    public void accept (AnimalVisitor visitor) {
        visitor.visit(this);    }

}
