package adapter;

/**
 * 类适配器测试
 */
public class ClassAdapterTest {

    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.target();
    }
}
