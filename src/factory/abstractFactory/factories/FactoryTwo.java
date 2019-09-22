package factory.abstractFactory.factories;

import factory.abstractFactory.factories.interfaces.Factory;
import factory.abstractFactory.products.meats.Beef;
import factory.abstractFactory.products.meats.interfaces.Meat;
import factory.abstractFactory.products.vegetables.Broccoli;
import factory.abstractFactory.products.vegetables.interfaces.Vegetable;

/**
 * 二号工厂
 *
 * @author zhihaoyu
 */
public class FactoryTwo implements Factory {

    /**
     * 生产牛肉
     *
     * @return 牛肉
     */
    @Override
    public Meat produceMeat() {
        return new Beef();
    }

    /**
     * 生产西兰花
     *
     * @return 西兰花
     */
    @Override
    public Vegetable produceVegetable() {
        return new Broccoli();
    }
}
