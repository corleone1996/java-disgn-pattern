package factory.abstractFactory.products.vegetables;

import factory.abstractFactory.products.vegetables.interfaces.Vegetable;

/**
 * 白菜
 *
 * @author zhihaoyu
 */
public class Cabbage implements Vegetable {

    /**
     * 吃白菜
     */
    @Override
    public void eat() {
        System.out.println("白菜有白菜的味道");
    }
}
