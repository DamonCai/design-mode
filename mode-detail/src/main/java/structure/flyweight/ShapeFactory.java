package structure.flyweight;

import java.util.HashMap;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.flyweight
 * @date Date:2019/8/9 15:54
 */

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
