package factory.ordinaryFactory.factories;

import factory.ordinaryFactory.factories.interfaces.Factory;
import factory.ordinaryFactory.products.interfaces.Product;
import factory.ordinaryFactory.products.ProductOne;

/**
 * 一号工厂
 *
 * @author zhihaoyu
 */
public class FactoryOne implements Factory {

    /**
     * 获取一号产品
     *
     * @return 一号产品
     */
    @Override
    public Product produce() {
        return new ProductOne();
    }
}
