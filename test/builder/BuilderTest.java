package builder;

/**
 * 建造者模式测试
 */
public class BuilderTest {

    public static void main(String[] args) {
        System.out.println("==非建造者模式获取产品==");
        Product product = new Product();
        product.setPart1("上海零件厂生产的零件1");
        product.setPart2("上海零件厂生产的零件2");
        System.out.println(product);

        System.out.println("==建造者模式获取产品==");
        // 声明一个厂商
        AbstractBuilder builder = new ShangHaiBuilder();
        // 声明一个采购员，并与厂商联系
        Buyer buyer = new Buyer(builder);
        // 采购员采购产品
        Product product1 = buyer.buyProduct();
        System.out.println(product1);
    }
}
