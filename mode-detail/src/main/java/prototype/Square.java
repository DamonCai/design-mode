package prototype;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:prototype
 * @date Date:2019/8/8 17:36
 *
 * 正方形
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
