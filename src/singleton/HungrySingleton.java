package singleton;

/**
 * 饿汉式单例模式
 * 注：饿汉式单例模式在类加载时就会创建一个不可变的单例对象，所以是线程安全的。
 *
 * @author zhihaoyu
 */
public class HungrySingleton {

    /**
     * 单例对象
     */
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    /**
     * 私有化构造方法，禁止外部创建
     */
    private HungrySingleton() {
    }

    /**
     * 获取单例对象静态方法
     *
     * @return 单例对象
     */
    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
