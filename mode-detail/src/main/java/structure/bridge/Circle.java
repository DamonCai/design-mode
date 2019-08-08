package structure.bridge;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.bridge
 * @date Date:2019/8/8 20:44
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
