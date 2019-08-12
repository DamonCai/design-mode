package behavior.command;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.command
 * @date Date:2019/8/12 23:38
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ",  Quantity:" + quantity +" ]bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ",  Quantity:" + quantity +" ]sold ");
    }
}
