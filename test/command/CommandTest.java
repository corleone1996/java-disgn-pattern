package command;

import commad.*;

/**
 * 命令模式测试
 */
public class CommandTest {

    public static void main(String[] args) {
        System.out.println("==非命令模式下的老板下命令==");
        // 有一个工人A
        Worker worker = new WorkerA();
        // 老板A找到工人A
        BossA bossA = new BossA(worker);
        // 老板A让工人A干活
        bossA.command();

        System.out.println("==命令模式下的老板下命令==");
        // “命令系统”中有一个命令A
        Command command = new CommandA();
        // 老板B找到命令A
        Boss bossB = new BossB(command);
        // 老板B下达命令A
        bossB.command();
    }
}
