package decorator;

/**
 * 具体装饰A
 */
public class ConcreteDecoratorA extends AbstractDecorator {

    /**
     * 构造器
     *
     * @param someInterface 需要添加功能的目标对象接口
     */
    public ConcreteDecoratorA(SomeInterface someInterface) {
        super(someInterface);
    }

    @Override
    public void operation() {
        super.operation();
        otherOperationA();
    }

    /**
     * 其他操作A
     */
    private void otherOperationA() {
        System.out.println("other operation A");
    }
}
