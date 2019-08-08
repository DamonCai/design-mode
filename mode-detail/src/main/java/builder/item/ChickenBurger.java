package builder.item;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:builder.item
 * @date Date:2019/8/8 12:01
 *
 * 鸡肉汉堡
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
