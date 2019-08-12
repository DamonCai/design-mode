package behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.command
 * @date Date:2019/8/12 23:39
 *
 * Broker 对象使用命令模式，基于命令的类型确定哪个对象执行哪个命令
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
