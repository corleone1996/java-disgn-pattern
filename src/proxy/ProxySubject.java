package proxy;

/**
 * 代理主题
 *
 * @author zhihaoyu
 */
public class ProxySubject implements Subject {

    /**
     * 真实主题
     */
    private RealSubject realSubject = new RealSubject();

    /**
     * 浏览
     */
    @Override
    public void browse() {
        preBrowse();
        realSubject.browse();
        postBrowse();
    }

    /**
     * 浏览前
     */
    private void preBrowse() {
        System.out.println("浏览之前做点什么");
    }

    /**
     * 浏览后
     */
    private void postBrowse() {
        System.out.println("浏览之后做点什么");
    }
}
