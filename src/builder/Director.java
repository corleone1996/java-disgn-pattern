package builder;

import builder.builders.abstracts.Builder;

/**
 * 指挥者
 *
 * @author zhihaoyu
 */
public class Director {

    /**
     * 建造者
     */
    private Builder builder;

    /**
     * 构造器
     *
     * @param builder 建造者
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 建造
     *
     * @return 产品
     */
    public Product build() {
        builder.buildPartOne();
        builder.buildPartTwo();
        builder.buildPartThree();
        return builder.getProduct();
    }
}
