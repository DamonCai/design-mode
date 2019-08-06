package singleton;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:singleton
 * @date Date:2019/8/6 15:29
 *
 * 懒汉模式延迟加载,懒加载
 *
 * 线程不安全 调用效率不高
 */
public class LazyType {

    private static LazyType lazyType;

    private LazyType() {

    }

    public static LazyType getInstance() {
        if (null == lazyType) {
            try {
                // 模拟在创建对象之前做一些准备工作
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lazyType = new LazyType();
        }
        return lazyType;
    }

    public static void main(String[] args) {

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> System.out.println(LazyType.getInstance().hashCode()));
            threads[i].start();
        }
    }



}

