package create.builder.item;

import create.builder.pack.Packing;
import create.builder.pack.Wrapper;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.builder
 *
 * 抽象出汉堡类，汉堡的包装方式是纸盒
 *
 * 不同的汉堡，包装都是纸盒，但是价格，名字不一样
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
