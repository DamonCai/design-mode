package create.builder.item;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.builder.item
 *
 * 百事可乐
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
