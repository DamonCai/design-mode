package create.singleton;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.singleton
 *
 *
 * 饿汉模式就是立即加载
 *
 * 线程安全，调用效率高，但是不能延时加载
 */
public class HungryType {


    private static HungryType instance = new HungryType();

    //将构造器设置为private禁止通过new进行实例化
    private HungryType() {
    }

    public static HungryType getInstance() {
        return instance;
    }

    // 以多线程的测试结果来看，hashCode值唯一，可以看出在类只加载了一次
    public static void main(String[] args) {

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> System.out.println(HungryType.getInstance().hashCode()));
            threads[i].start();
        }

    }


}


