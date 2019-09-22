package factory.ordinaryFactory;

import factory.ordinaryFactory.factories.interfaces.Factory;
import factory.ordinaryFactory.products.interfaces.Product;

/**
 * 测试类
 *
 * @author zhihaoyu
 */
public class Test {

    private static final String FACTORY_PACKAGE =
            "factory.ordinaryFactory.factories";

    /**
     * 测试方法
     */
    public static void main(String[] args) {
        Product product = getProductByFactoryType("FactoryOne");
        product.use();
        product = getProductByFactoryType("FactoryTwo");
        product.use();
    }

    /**
     * 根据工厂类型获取对应产品
     *
     * @param factoryType 工厂类型
     * @return 对应产品
     */
    private static Product getProductByFactoryType(String factoryType) {
        String className = FACTORY_PACKAGE + "." + factoryType;
        return getProductByClassName(className);
    }

    /**
     * 根据工厂类名获取产品实例
     *
     * @param className 工厂类名
     * @return 产品实力
     */
    private static Product getProductByClassName(String className) {
        Product product = null;
        try {
            Class cls = Class.forName(className);
            Object obj = cls.newInstance();
            product = ((Factory) obj).produce();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }
}
