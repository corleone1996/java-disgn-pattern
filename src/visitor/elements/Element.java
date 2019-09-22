package visitor.elements;

import visitor.visitors.Visitor;

/**
 * 抽象元素
 *
 * @author zhy
 */
public interface Element {

    void accept(Visitor visitor);
}
