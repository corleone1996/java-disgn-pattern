package factory.ordinaryFactory.products;

import factory.ordinaryFactory.products.interfaces.Product;

/**
 * 一号产品
 *
 * @author zhihaoyu
 */
public class ProductOne implements Product {

    /**
     * 使用一号产品
     */
    @Override
    public void use() {
        System.out.println("一号产品有一号产品的用途");
    }
}
