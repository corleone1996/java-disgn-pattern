package factory.ordinaryFactory.products;

import factory.ordinaryFactory.products.interfaces.Product;

/**
 * 二号产品
 *
 * @author zhihaoyu
 */
public class ProductTwo implements Product {

    /**
     * 使用二号产品
     */
    @Override
    public void use() {
        System.out.println("二号产品有二号产品的用途");
    }
}
