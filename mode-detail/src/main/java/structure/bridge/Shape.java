package structure.bridge;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.bridge
 * @date Date:2019/8/8 20:43
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
