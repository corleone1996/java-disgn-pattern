package template;

/**
 * @author zhy
 */
public class Test {

    public static void main(String[] args) {
        AbstractClass template = new ConcreteClass();
        template.templateMethod();
    }
}
