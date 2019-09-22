package visitor;

import visitor.elements.ConcreteElementA;
import visitor.elements.ConcreteElementB;
import visitor.visitors.ConcreteVisitorA;
import visitor.visitors.ConcreteVisitorB;
import visitor.visitors.Visitor;

/**
 * @author zhy
 */
public class Test {

    public static void main(String[] args) {
        ObjectStructure objStruct = new ObjectStructure();
        objStruct.add(new ConcreteElementA());
        objStruct.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        objStruct.accept(visitor);
        System.out.println("------------------------");
        visitor = new ConcreteVisitorB();
        objStruct.accept(visitor);
    }
}
