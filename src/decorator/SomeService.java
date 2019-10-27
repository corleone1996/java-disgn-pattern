package decorator;

/**
 * 某个实现类
 */
public class SomeService implements SomeInterface {

    @Override
    public void operation() {
        System.out.println("some operation");
    }
}
