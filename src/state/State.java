package state;

/**
 * 抽象状态
 *
 * @author zhy
 */
public abstract class State {

    public abstract void handle(Context context);
}
