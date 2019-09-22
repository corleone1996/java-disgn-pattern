package proxy;

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
        Subject subject = new ProxySubject();
        subject.browse();
    }
}
