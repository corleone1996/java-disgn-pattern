package builder;

/**
 * 抽象厂商（抽象建造者）
 */
public abstract class AbstractBuilder {

    /**
     * 产品
     */
    protected Product product = new Product();

    /**
     * 建造零件1
     */
    protected abstract void buildPart1();

    /**
     * 建造零件2
     */
    protected abstract void buildPart2();

    /**
     * 生产产品
     *
     * @return 产品
     */
    public Product produceProduct() {
        return product;
    }
}
