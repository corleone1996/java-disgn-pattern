package factory.abstractFactory.factories;

import factory.abstractFactory.factories.interfaces.Factory;
import factory.abstractFactory.products.meats.interfaces.Meat;
import factory.abstractFactory.products.meats.Pork;
import factory.abstractFactory.products.vegetables.Cabbage;
import factory.abstractFactory.products.vegetables.interfaces.Vegetable;

/**
 * 一号工厂
 *
 * @author zhihaoyu
 */
public class FactoryOne implements Factory {

    /**
     * 生产猪肉
     *
     * @return 猪肉
     */
    @Override
    public Meat produceMeat() {
        return new Pork();
    }

    /**
     * 生产白菜
     *
     * @return 白菜
     */
    @Override
    public Vegetable produceVegetable() {
        return new Cabbage();
    }
}
