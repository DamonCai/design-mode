package abstractfactory;

import factory.Animal;
import factory.Cat;
import factory.Dog;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:abstractfactory
 * @date Date:2019/8/6 20:38
 */
public class AnimalFactory extends AbstractFactory {

    @Override
    public Animal getAnimal(String animal) {
        if (animal == null) {
            return null;
        }
        if (animal.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if (animal.equalsIgnoreCase("dog")) {
            return new Dog();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
