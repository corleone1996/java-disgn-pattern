package singleton;

/**
 * 懒汉式单例模式
 * 注：多线程情况下需要使用volatile和synchronized关键字，以保证
 * 线程安全性。但每次访问都需要同步，会影响性能，且更费资源，
 * 这就是懒汉式单例模式的缺点。
 *
 * @author zhihaoyu
 */
public class LazySingleton {

    /**
     * 单例对象
     * 注：volatile关键字用来保证多线程情况下的可见性
     */
    private static volatile LazySingleton INSTANCE = null;

    /**
     * 私有化构造方法，禁止外部创建
     */
    private LazySingleton() {
    }

    /**
     * 获取单例对象静态方法
     * 注：synchronized关键字保证获取单例对象操作的原子性
     *
     * @return 单例对象
     */
    public static synchronized LazySingleton getInstance() {
        if (INSTANCE == null) {
            // 若单例对象未创建则进行创建
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
