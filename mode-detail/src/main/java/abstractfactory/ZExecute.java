package abstractfactory;

import factory.Animal;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:abstractfactory
 * @date Date:2019/8/6 22:42
 */
public class ZExecute {


    public static void main(String[] args) {

        //获取形状工厂
        AbstractFactory animalFactory = FactoryProducer.getFactory("ANIMAL");
        //获取形状为 Animal 的对象
        Animal animal = animalFactory.getAnimal("cat");

        //调用 animal 的 voice 方法
        animal.voice();


        //获取形状工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        //获取形状为 Animal 的对象
        Color color = colorFactory.getColor("BLUE");
        //调用 animal 的 voice 方法
        color.fill();

    }
}
