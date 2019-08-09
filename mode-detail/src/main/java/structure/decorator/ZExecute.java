package structure.decorator;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.composite
 */
public class ZExecute {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}
