package builder;

/**
 * 采购员
 */
public class Buyer {

    /**
     * 厂商
     */
    private AbstractBuilder builder;

    /**
     * 构造器
     *
     * @param builder 厂商
     */
    public Buyer(AbstractBuilder builder) {
        this.builder = builder;
    }

    /**
     * 采购产品
     *
     * @return 产品
     */
    public Product buyProduct() {
        builder.buildPart1();
        builder.buildPart2();
        return builder.produceProduct();
    }
}
