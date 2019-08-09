package structure.facade;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.facade
 * @date Date:2019/8/9 15:15
 *
 * 外观类
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
