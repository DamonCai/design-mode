package factory;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:factory
 * @date Date:2019/8/6 19:39
 */
public class AnimalFactory {

    //使用 getAnimal 方法获取形状类型的对象
    public Animal getAnimal(String animal) {
        if (animal == null) {
            return null;
        }
        if (animal.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if (animal.equalsIgnoreCase("dog")) {
            return new Dog();
        }
        return null;
    }


    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        //获取 Animal 的对象，并调用它的 draw 方法
        Animal animal = animalFactory.getAnimal("cat");
        //调用 cat 的 draw 方法
        animal.voice();
    }


}
