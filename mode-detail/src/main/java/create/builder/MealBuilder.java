package create.builder;

import create.builder.item.ChickenBurger;
import create.builder.item.Coke;
import create.builder.item.Pepsi;
import create.builder.item.VegBurger;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.builder
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
