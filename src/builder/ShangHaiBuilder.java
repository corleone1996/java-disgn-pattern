package builder;

/**
 * 上海零件厂（具体建造者）
 */
public class ShangHaiBuilder extends AbstractBuilder {

    @Override
    protected void buildPart1() {
        product.setPart1("上海零件厂生产的零件1");
    }

    @Override
    protected void buildPart2() {
        product.setPart2("上海零件厂生产的零件2");
    }
}
