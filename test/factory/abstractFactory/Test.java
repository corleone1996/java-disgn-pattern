package factory.abstractFactory;

import factory.abstractFactory.factories.interfaces.Factory;
import factory.abstractFactory.factories.FactoryTwo;
import factory.abstractFactory.products.meats.interfaces.Meat;
import factory.abstractFactory.products.vegetables.interfaces.Vegetable;

/**
 * 测试类
 *
 * @author zhihaoyu
 */
public class Test {

    /**
     * 测试方法
     */
    public static void main(String[] args) {
        Factory factory = new FactoryTwo();
        Meat meat = factory.produceMeat();
        meat.eat();
        Vegetable vegetable = factory.produceVegetable();
        vegetable.eat();
    }
}
