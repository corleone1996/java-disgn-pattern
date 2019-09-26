package adapter;

/**
 * 对象适配器测试
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {
        Origin origin = new Origin();
        Target target = new ObjectAdapter(origin);
        target.target();
    }
}
