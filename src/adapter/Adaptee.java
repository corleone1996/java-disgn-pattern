package adapter;

/**
 * 适配者
 *
 * @author zhihaoyu
 */
public class Adaptee {

    /**
     * 请求
     */
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用");
    }
}
