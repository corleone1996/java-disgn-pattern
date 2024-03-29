package visitor.visitors;

import visitor.elements.ConcreteElementA;
import visitor.elements.ConcreteElementB;

/**
 * 具体访问者B
 *
 * @author zhy
 */
public class ConcreteVisitorB implements Visitor {

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者B访问-->" + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者B访问-->" + element.operationB());
    }
}
