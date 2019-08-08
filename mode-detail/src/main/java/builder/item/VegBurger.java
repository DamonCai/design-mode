package builder.item;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:builder.item
 * @date Date:2019/8/8 12:00
 *
 * 蔬菜汉堡
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
