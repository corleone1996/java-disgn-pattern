package decorator;

/**
 * 具体装饰B
 */
public class ConcreteDecoratorB extends AbstractDecorator {

    /**
     * 构造器
     *
     * @param someInterface 需要添加功能的目标对象接口
     */
    public ConcreteDecoratorB(SomeInterface someInterface) {
        super(someInterface);
    }

    @Override
    public void operation() {
        super.operation();
        otherOperationB();
    }

    /**
     * 其他操作B
     */
    private void otherOperationB() {
        System.out.println("other operation B");
    }
}
