package visitor;
import model.*;

public class Cleaner implements AnimalVisitor{

    @Override
    public void visit(Lion lion){
        System.out.println("Cleaner: Cleaning lion cage, changing water");
    }

    @Override
    public void visit(Monkey monkey){
        System.out.println("Cleaner: Cleaning monkey enclosure, removing banana peels");
    }
    @Override
    public void visit(Wolf wolf){
        System.out.println("Cleaner: Cleaning monkey enclosure, removing banana peels");
    }
}
