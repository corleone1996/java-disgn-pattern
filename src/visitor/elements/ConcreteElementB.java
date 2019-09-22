package visitor.elements;

import visitor.visitors.Visitor;

/**
 * 具体元素B
 *
 * @author zhy
 */
public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体元素B的操作";
    }
}
