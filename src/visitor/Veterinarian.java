package visitor;
import model.*;
public class Veterinarian implements AnimalVisitor {
    @Override
    public void visit(Lion lion){
        System.out.println("Veterinarian: Treating lion - checking teeth, giving injection");
    }
    @Override
    public void visit(Monkey monkey){
        System.out.println("Veterinarian: Treating monkey - checking temperature, giving vitamins");
    }
    @Override
    public void visit(Wolf wolf){
             System.out.println("Veterinarian: Treating wolf - treating wounds, giving vaccine");
    }
}
