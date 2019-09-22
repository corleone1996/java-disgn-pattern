package builder;

/**
 * 产品
 *
 * @author zhihaoyu
 */
public class Product {

    /**
     * 部分一
     */
    private String partOne;
    /**
     * 部分二
     */
    private String partTwo;
    /**
     * 部分三
     */
    private String partThree;

    public void setPartOne(String partOne) {
        this.partOne = partOne;
    }

    public void setPartTwo(String partTwo) {
        this.partTwo = partTwo;
    }

    public void setPartThree(String partThree) {
        this.partThree = partThree;
    }

    public void use() {
        System.out.println("使用该产品的功能");
    }

    @Override
    public String toString() {
        return "The part one is: " + partOne +
                ", the part two is: " + partTwo +
                ", the part three is: " + partThree
                + ".";
    }
}
