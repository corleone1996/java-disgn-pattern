package decorator;

/**
 * 抽象装饰
 */
public abstract class AbstractDecorator implements SomeInterface {

    /**
     * 对目标对象接口的引用
     */
    private SomeInterface someInterface;

    /**
     * 构造器
     *
     * @param someInterface 需要添加功能的目标对象接口
     */
    public AbstractDecorator(SomeInterface someInterface) {
        this.someInterface = someInterface;
    }

    /**
     * 默认的操作方法实现
     */
    @Override
    public void operation() {
        someInterface.operation();
    }
}
