package visitor.visitors;

import visitor.elements.ConcreteElementA;
import visitor.elements.ConcreteElementB;

/**
 * 具体访问者A
 *
 * @author zhy
 */
public class ConcreteVisitorA implements Visitor {

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者A访问-->" + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者A访问-->" + element.operationB());
    }
}
