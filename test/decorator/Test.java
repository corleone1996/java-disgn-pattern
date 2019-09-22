package decorator;

/**
 * @author zhy
 */
public class Test {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        System.out.println("-----------------------");
        component = new ConcreteDecorator(component);
        component.operation();
    }
}
