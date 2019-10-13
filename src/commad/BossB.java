package commad;

/**
 * 老板B
 */
public class BossB implements Boss {

    /**
     * “命令系统”中的命令
     */
    private Command command;

    /**
     * 构造器
     *
     * @param command 命令
     */
    public BossB(Command command) {
        this.command = command;
    }

    @Override
    public void command() {
        command.execute();
    }
}
