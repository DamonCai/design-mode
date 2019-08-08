package abstractfactory;

import factory.Animal;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:abstractfactory
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Animal getAnimal(String shape);
}
