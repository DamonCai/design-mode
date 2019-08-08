package singleton;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:singleton
 *
 * DCL double-checked locking
 *
 * 双检锁/双重校验锁
 *
 * 基于lazy的模式
 */
public class DCLType {


    //因为jvm内存模型的原因，返回实例对象可能不止一个 ，因而需加上volatile或者改善内存模型
    private volatile static DCLType dclType;

    private DCLType() {
    }


    public static DCLType getInstance() {
        if (dclType == null) {
            synchronized (DCLType.class) {
                if (dclType == null) {
                    dclType = new DCLType();
                }
            }
        }
        return dclType;
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> System.out.println(DCLType.getInstance().hashCode()));
            threads[i].start();
        }

    }

}
