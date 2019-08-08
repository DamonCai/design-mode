package builder;

import builder.item.ChickenBurger;
import builder.item.Coke;
import builder.item.Pepsi;
import builder.item.VegBurger;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:builder
 *
 * 自定义的套餐 ， 蔬菜汉堡+可乐   鸡肉汉堡+百事
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
