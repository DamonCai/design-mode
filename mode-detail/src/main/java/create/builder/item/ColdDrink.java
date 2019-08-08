package create.builder.item;

import create.builder.pack.Bottle;
import create.builder.pack.Packing;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.builder
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
