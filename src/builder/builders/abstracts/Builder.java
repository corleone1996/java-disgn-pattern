package builder.builders.abstracts;

import builder.Product;

/**
 * 抽象建造者
 *
 * @author zhihaoyu
 */
public abstract class Builder {

    /**
     * 产品
     */
    protected Product product = new Product();

    /**
     * 建造部分一
     */
    public abstract void buildPartOne();

    /**
     * 建造部分二
     */
    public abstract void buildPartTwo();

    /**
     * 建造部分三
     */
    public abstract void buildPartThree();

    /**
     * 获取产品
     *
     * @return 产品
     */
    public Product getProduct() {
        return product;
    }
}
