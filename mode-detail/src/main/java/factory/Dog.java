package factory;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:factory
 * @date Date:2019/8/6 19:38
 */
public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("狗叫声");
    }
}
