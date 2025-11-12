package visitor;


import model.*;

public class Trainer implements AnimalVisitor{
    @Override
    public void visit(Lion lion){
        System.out.println("Trainer: Training lion to jump through hoop");
    }
    @Override
    public void visit(Monkey monkey){
        System.out.println("Trainer: Training monkey to ride bicycle");
    }
    @Override
    public void visit(Wolf wolf){
        System.out.println("Trainer: Training wolf to follow commands");
    }
}
