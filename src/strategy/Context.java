package strategy;

/**
 * 环境
 *
 * @author zhy
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return this.strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
