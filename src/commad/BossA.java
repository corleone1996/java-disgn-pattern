package commad;

/**
 * 老板A
 */
public class BossA implements Boss {

    /**
     * 工人
     */
    private Worker worker;

    /**
     * 构造器
     *
     * @param worker 工人
     */
    public BossA(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void command() {
        worker.work();
    }
}
