package visitor;

import model.*;

public interface AnimalVisitor {
    void visit(Lion lion);
    void visit(Monkey monkey);
    void visit(Wolf wolf);

}
