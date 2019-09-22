package decorator;

/**
 * 具体构件
 *
 * @author zhy
 */
public class ConcreteComponent implements Component {

    public ConcreteComponent() {
        System.out.println("创建具体构件");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件的方法");
    }
}
