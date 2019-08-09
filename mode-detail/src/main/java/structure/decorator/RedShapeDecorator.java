package structure.decorator;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.decorator
 * @date Date:2019/8/9 14:24
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println(decoratedShape.getClass().toString() + "-------Border Color: Red");
    }
}
