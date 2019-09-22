package commad;

/**
 * 具体命令
 *
 * @author zhihaoyu
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand() {
        this.receiver = new Receiver();
    }

    /**
     * 执行命令
     */
    @Override
    public void execute() {
        receiver.action();
    }
}
