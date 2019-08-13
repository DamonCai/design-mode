package behavior.strategy;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.strategy
 * @date Date:2019/8/13 14:06
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
