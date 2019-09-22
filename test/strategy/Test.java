package strategy;

/**
 * @author zhy
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context();

        Strategy strategy = new ConcreteStrategyA();
        context.setStrategy(strategy);
        context.strategyMethod();

        strategy = new ConcreteStrategyB();
        context.setStrategy(strategy);
        context.strategyMethod();
    }
}
