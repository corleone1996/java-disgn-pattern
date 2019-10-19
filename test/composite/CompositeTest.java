package composite;

/**
 * 组合模式测试
 */
public class CompositeTest {

    public static void main(String[] args) {
        // 员工张三
        Worker zhangsan = new Worker("我是张三，我是个员工");
        zhangsan.getInfo();
        // 员工李四
        Worker lisi = new Worker("我是李四，我也是个员工");
        lisi.getInfo();
        // 老板王二麻子
        Boss wangermazi = new Boss("我叫王二麻子，我是老板");
        wangermazi.getInfo();
        // 王二麻子的手下有张三和李四
        wangermazi.addWorker(zhangsan);
        wangermazi.addWorker(lisi);
        wangermazi.getWorkerInfo();
    }
}
