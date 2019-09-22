package factory.abstractFactory.products.vegetables;

import factory.abstractFactory.products.vegetables.interfaces.Vegetable;

/**
 * 西兰花
 *
 * @author zhihaoyu
 */
public class Broccoli implements Vegetable {

    /**
     * 吃西兰花
     */
    @Override
    public void eat() {
        System.out.println("西兰花有西兰花的味道");
    }
}
