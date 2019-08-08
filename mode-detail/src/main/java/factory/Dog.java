package factory;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:factory
 */
public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("狗叫声");
    }
}
