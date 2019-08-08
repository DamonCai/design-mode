package structure.bridge;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.factory
 */
public class ZExecute {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
