package commad;

/**
 * 命令B
 */
public class CommandB implements Command {

    /**
     * 命令B针对工人B
     */
    private Worker worker = new WorkerB();

    @Override
    public void execute() {
        System.out.println("命令B执行");
        worker.work();
    }
}
