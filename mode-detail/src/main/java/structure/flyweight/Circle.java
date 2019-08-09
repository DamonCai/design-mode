package structure.flyweight;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.flyweight
 * @date Date:2019/8/9 15:43
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
            +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
