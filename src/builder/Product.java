package builder;

/**
 * 产品
 */
public class Product {

    /**
     * 零件1
     */
    private String part1;
    /**
     * 零件2
     */
    private String part2;

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public String toString() {
        return "零件1：" + part1 +
                "，零件2：" + part2;
    }
}
