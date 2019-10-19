package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 老板
 */
public class Boss extends Person {

    /**
     * 构造器
     *
     * @param info 信息
     */
    public Boss(String info) {
        super(info);
    }

    /**
     * 手下的员工
     */
    private List<Person> workers = new ArrayList<>();

    /**
     * 招聘员工
     *
     * @param person 员工
     */
    public void addWorker(Person person) {
        workers.add(person);
    }

    /**
     * 解聘员工
     *
     * @param person 员工
     */
    public void removeWorker(Person person) {
        workers.remove(person);
    }

    /**
     * 查看员工信息
     */
    public void getWorkerInfo() {
        for (Person person : workers) {
            person.getInfo();
            if (person instanceof Boss) {
                ((Boss) person).getWorkerInfo();
            }
        }
    }
}
