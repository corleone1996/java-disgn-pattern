package commad;

/**
 * 命令A
 */
public class CommandA implements Command {

    /**
     * 命令A针对工人A
     */
    private Worker worker = new WorkerA();

    @Override
    public void execute() {
        System.out.println("命令A执行");
        worker.work();
    }
}
