package structure.facade;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.facade
 */
public class ZExecute {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
