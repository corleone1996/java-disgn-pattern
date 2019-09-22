package template;

/**
 * @author zhy
 */
public class ConcreteClass extends AbstractClass {

    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的具体实现被调用");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的具体实现被调用");
    }
}
