package adapter;

/**
 * 类适配器
 *
 * @author zhihaoyu
 */
public class ClassAdapter extends Adaptee implements Target {

    /**
     * 请求
     */
    @Override
    public void request() {
        specificRequest();
    }
}
