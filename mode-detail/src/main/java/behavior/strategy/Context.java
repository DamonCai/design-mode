package behavior.strategy;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.strategy
 * @date Date:2019/8/13 14:07
 *
 * 使用策略的类
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
