package adapter;

/**
 * 对象适配器
 *
 * @author zhihaoyu
 */
public class ObjectAdapter implements Target {

    /**
     * 适配者
     */
    private Adaptee adaptee;

    /**
     * 构造器
     *
     * @param adaptee 适配者
     */
    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 请求
     */
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
