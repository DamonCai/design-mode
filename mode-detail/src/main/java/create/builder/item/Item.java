package create.builder.item;

import create.builder.pack.Packing;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:impl
 *
 * 商品
 */
public interface Item {

    // 名字
    public String name();

    // 包装
    public Packing packing();

    // 价格
    public float price();
}
