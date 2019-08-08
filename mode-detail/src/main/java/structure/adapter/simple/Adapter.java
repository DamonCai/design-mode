package structure.adapter.simple;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.adapter.simple
 * @date Date:2019/8/8 20:30
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void method2() {
        System.out.println("method 2");
    }


    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.method1();
        adapter.method2();
    }
}


