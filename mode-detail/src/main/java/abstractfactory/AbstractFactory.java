package abstractfactory;

import factory.Animal;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:abstractfactory
 * @date Date:2019/8/6 20:28
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Animal getAnimal(String shape);
}
