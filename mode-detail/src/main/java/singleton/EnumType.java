package singleton;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:singleton
 *
 * 枚举
 *
 * 线程安全
 *
 * enum有且仅有private的构造器，防止外部的额外构造，这恰好和单例模式吻合
 */
public enum EnumType {
    INSTANCE;

    public EnumType whateverMethod() {
        return EnumType.INSTANCE;
    }

    public static void main(String[] args) {

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] =
                new Thread(() -> System.out.println(EnumType.INSTANCE.whateverMethod().hashCode()));
            threads[i].start();
        }


    }

}
