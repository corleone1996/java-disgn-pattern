package mediator;

/**
 * 抽象中介者
 *
 * @author zhy
 */
public abstract class Mediator {

    /**
     * 注册
     *
     * @param colleague
     */
    public abstract void register(Colleague colleague);

    /**
     * 转发
     *
     * @param colleague
     */
    public abstract void relay(Colleague colleague);
}
