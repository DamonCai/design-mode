package create.prototype;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.factory
 */
public class ZExecute {

    public static void main(String[] args) {
        Shape clonedShape = ShapeCache.getShape("1");

        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
