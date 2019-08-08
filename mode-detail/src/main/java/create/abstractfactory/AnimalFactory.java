package create.abstractfactory;

import create.factory.Animal;
import create.factory.Cat;
import create.factory.Dog;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.abstractfactory
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
