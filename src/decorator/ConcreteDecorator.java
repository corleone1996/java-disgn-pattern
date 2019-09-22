package decorator;

/**
 * @author zhy
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        extraFunction();
    }

    private void extraFunction() {
        System.out.println("为具体构件添加额外的功能");
    }
}
