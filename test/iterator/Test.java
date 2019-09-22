package iterator;

/**
 * @author zhy
 */
public class Test {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("中山大学");
        aggregate.add("华南理工");
        aggregate.add("韶关学院");
        System.out.println("聚合的内容有：");
        Iterator iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj.toString() + "\t");
        }
        Object obj = iterator.first();
        System.out.println("First: " + obj.toString());
    }
}
