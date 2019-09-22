package visitor.elements;

import visitor.visitors.Visitor;

/**
 * 具体元素A
 *
 * @author zhy
 */
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素A的操作";
    }
}
