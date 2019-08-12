package behavior.command;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.command
 * @date Date:2019/8/12 23:39
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
