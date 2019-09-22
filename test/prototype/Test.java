package prototype;

/**
 * 测试类
 *
 * @author zhihaoyu
 */
public class Test {

    /**
     * 测试方法
     */
    public static void main(String[] args) {
        // 创造亚当
        Person Adam = new Person("Adam", "male", "sagwqrykjy7895236");
        // 创造克隆人亚当
        Person cloneAdam = Adam.clone();
        // 判断两个人是否拥有相同的姓名、性别和基因
        System.out.println("Clone Adam is just the same as Adam? ");
        System.out.println(Adam.equals(cloneAdam));
    }
}
