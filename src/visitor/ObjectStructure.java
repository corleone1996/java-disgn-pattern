package visitor;

import visitor.elements.Element;
import visitor.visitors.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对象结构角色
 *
 * @author zhy
 */
public class ObjectStructure {

    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (Element element : list) {
            element.accept(visitor);
        }
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }
}
