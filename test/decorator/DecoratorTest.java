package decorator;

/**
 * 装饰模式测试
 */
public class DecoratorTest {

    public static void main(String[] args) {
        // 原本的服务service
        SomeInterface service = new SomeService();
        service.operation();
        System.out.println("=================");
        // 使用装饰A给service添加装饰
        service = new ConcreteDecoratorA(service);
        service.operation();
        System.out.println("=================");
        // 使用装饰B给service添加装饰
        service = new ConcreteDecoratorB(service);
        service.operation();
    }
}
