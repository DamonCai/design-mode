package create.prototype;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.prototype
 * @date Date:2019/8/8 17:36
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
