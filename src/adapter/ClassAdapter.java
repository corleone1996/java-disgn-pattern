package adapter;

/**
 * 类适配器
 */
public class ClassAdapter extends Origin implements Target {

    /**
     * 实现了的目标方法
     */
    @Override
    public void target() {
        origin();
    }
}
