package factory.ordinaryFactory.factories;

import factory.ordinaryFactory.factories.interfaces.Factory;
import factory.ordinaryFactory.products.interfaces.Product;
import factory.ordinaryFactory.products.ProductTwo;

/**
 * 二号工厂
 *
 * @author zhihaoyu
 */
public class FactoryTwo implements Factory {

    /**
     * 获取二号产品
     *
     * @return 二号产品
     */
    @Override
    public Product produce() {
        return new ProductTwo();
    }
}
