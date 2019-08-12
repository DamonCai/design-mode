package behavior.command;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.command
 */
public class ZExecute {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}
