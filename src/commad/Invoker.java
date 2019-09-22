package commad;

/**
 * 调用者
 *
 * @author zhihaoyu
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("调用者执行命令");
        command.execute();
    }
}
