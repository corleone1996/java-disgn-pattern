package factory.abstractFactory.products.meats;

import factory.abstractFactory.products.meats.interfaces.Meat;

/**
 * 猪肉
 *
 * @author zhihaoyu
 */
public class Pork implements Meat {

    /**
     * 吃猪肉
     */
    @Override
    public void eat() {
        System.out.println("猪肉有猪肉的味道");
    }
}
