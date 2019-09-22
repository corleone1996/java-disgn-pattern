package factory.ordinaryFactory.factories.interfaces;

import factory.ordinaryFactory.products.interfaces.Product;

/**
 * 工厂接口
 * 注：此为普通工厂模式
 *
 * @author zhihaoyu
 */
public interface Factory {

    /**
     * 获取产品实例
     *
     * @return 产品实例
     */
    Product produce();
}
