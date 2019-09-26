package adapter;

/**
 * 对象适配器
 */
public class ObjectAdapter implements Target {

    /**
     * 原始接口对象
     */
    private Origin origin;

    /**
     * 构造器
     *
     * @param origin 原始接口对象
     */
    public ObjectAdapter(Origin origin) {
        this.origin = origin;
    }

    /**
     * 实现了的目标方法
     */
    @Override
    public void target() {
        origin.origin();
    }
}
