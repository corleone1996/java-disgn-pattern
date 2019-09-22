package prototype;

/**
 * 浅克隆原型模式
 * 注：原型模式对于创建过程比较复杂的对象采用克隆
 * 的方式进行复制，较为简便的同时也隐藏了创建细节
 *
 * @author zhihaoyu
 */
public class Prototype implements Cloneable {

    public Prototype() {
        System.out.println("原型实例创建成功");
    }

    /**
     * 克隆方法
     *
     * @return 原型实例的浅克隆对象
     * @throws CloneNotSupportedException 不支持克隆时抛出此异常
     */
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        System.out.println("原型实例复制成功");
        return (Prototype) super.clone();
    }

}
