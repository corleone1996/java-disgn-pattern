package flyweight;

/**
 * @author zhy
 */
public class Test {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f1 = factory.getFlyweight("a");
        Flyweight f2 = factory.getFlyweight("a");
        Flyweight f3 = factory.getFlyweight("a");
        Flyweight f4 = factory.getFlyweight("b");
        Flyweight f5 = factory.getFlyweight("b");
        f1.operation(new UnsharedConcreteFlyweight("第1次调用a"));
        f2.operation(new UnsharedConcreteFlyweight("第2次调用a"));
        f3.operation(new UnsharedConcreteFlyweight("第3次调用a"));
        f4.operation(new UnsharedConcreteFlyweight("第1次调用b"));
        f5.operation(new UnsharedConcreteFlyweight("第2次调用b"));
    }
}
