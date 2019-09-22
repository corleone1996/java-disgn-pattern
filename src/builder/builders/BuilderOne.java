package builder.builders;

import builder.builders.abstracts.Builder;

/**
 * 具体建造者一
 *
 * @author zhihaoyu
 */
public class BuilderOne extends Builder {

    @Override
    public void buildPartOne() {
        product.setPartOne("以第一种方式建造的部分一");
    }

    @Override
    public void buildPartTwo() {
        product.setPartTwo("以第一种方式建造的部分二");
    }

    @Override
    public void buildPartThree() {
        product.setPartThree("以第一种方式建造的部分三");
    }
}
