package builder.item;

import builder.pack.Bottle;
import builder.pack.Packing;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:builder
 * @date Date:2019/8/8 11:51
 *
 * 冷饮 商品
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}