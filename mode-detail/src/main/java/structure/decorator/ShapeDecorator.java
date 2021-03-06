package structure.decorator;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.decorator
 * @date Date:2019/8/9 14:24
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
