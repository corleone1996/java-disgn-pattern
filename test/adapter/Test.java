package adapter;

/**
 * 测试
 *
 * @author zhihaoyu
 */
public class Test {

    /**
     * 测试
     */
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
