package proxy;

/**
 * 真实主题
 *
 * @author zhihaoyu
 */
public class RealSubject implements Subject {

    /**
     * 浏览
     */
    @Override
    public void browse() {
        System.out.println("浏览主题内容");
    }
}
