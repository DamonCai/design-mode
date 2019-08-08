package create.prototype;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.prototype
 * @date Date:2019/8/8 17:34
 *
 * 矩形
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
