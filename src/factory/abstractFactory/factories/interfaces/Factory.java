package factory.abstractFactory.factories.interfaces;

import factory.abstractFactory.products.meats.interfaces.Meat;
import factory.abstractFactory.products.vegetables.interfaces.Vegetable;

/**
 * 工厂接口
 * 注：此为抽象工厂模式
 *
 * @author zhihaoyu
 */
public interface Factory {

    /**
     * 生产肉类
     *
     * @return 肉类
     */
    Meat produceMeat();

    /**
     * 生产蔬菜
     *
     * @return 蔬菜
     */
    Vegetable produceVegetable();
}
