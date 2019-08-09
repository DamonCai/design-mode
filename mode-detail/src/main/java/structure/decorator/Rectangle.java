package structure.decorator;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.decorator
 * @date Date:2019/8/9 14:23
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
