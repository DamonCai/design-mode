package create.abstractfactory;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.abstractfactory
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("ANIMAL")) {
            return new AnimalFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }


}
