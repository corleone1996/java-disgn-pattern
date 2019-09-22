package factory.abstractFactory.products.meats;

import factory.abstractFactory.products.meats.interfaces.Meat;

/**
 * 牛肉
 *
 * @author zhihaoyu
 */
public class Beef implements Meat {

    /**
     * 吃牛肉
     */
    @Override
    public void eat() {
        System.out.println("牛肉有牛肉的味道");
    }
}
