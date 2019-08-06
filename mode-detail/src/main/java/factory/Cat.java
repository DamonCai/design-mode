package factory;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:factory
 * @date Date:2019/8/6 19:37
 */
public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("猫叫声");
    }
}
