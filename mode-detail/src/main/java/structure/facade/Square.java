package structure.facade;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.facade
 * @date Date:2019/8/9 15:13
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
