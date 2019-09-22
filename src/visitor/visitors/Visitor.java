package visitor.visitors;

import visitor.elements.ConcreteElementA;
import visitor.elements.ConcreteElementB;

/**
 * 抽象访问者
 *
 * @author zhy
 */
public interface Visitor {

    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
