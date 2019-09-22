package builder;

import builder.builders.BuilderOne;
import builder.builders.abstracts.Builder;

/**
 * 测试
 *
 * @author zhihaoyu
 */
public class Test {

    /**
     * 测试
     */
    public static void main(String[] args) {
        Builder builder = new BuilderOne();
        Director director = new Director(builder);
        Product product = director.build();
        System.out.println(product);
    }
}
