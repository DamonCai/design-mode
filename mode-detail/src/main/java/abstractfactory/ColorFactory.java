package abstractfactory;

import factory.Animal;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:abstractfactory
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Animal getAnimal(String animal) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
