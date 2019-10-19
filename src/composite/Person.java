package composite;

/**
 * 人（老板和员工都是人）
 */
public abstract class Person {

    /**
     * 信息
     */
    private String info;

    /**
     * 构造器
     *
     * @param info 信息
     */
    public Person(String info) {
        this.info = info;
    }

    /**
     * 查询信息
     */
    public void getInfo() {
        System.out.println(this.info);
    }
}
