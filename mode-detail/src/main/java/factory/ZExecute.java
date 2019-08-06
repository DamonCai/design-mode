package factory;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:factory
 * @date Date:2019/8/6 22:41
 */
public class ZExecute {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        //获取 Animal 的对象，并调用它的 draw 方法
        Animal animal = animalFactory.getAnimal("cat");
        //调用 cat 的 draw 方法
        animal.voice();
    }
}
