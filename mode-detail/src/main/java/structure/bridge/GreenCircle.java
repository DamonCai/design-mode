package structure.bridge;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.bridge
 * @date Date:2019/8/8 20:42
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(
            "Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
