package create.singleton;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.singleton
 *
 * 登记式
 *
 * 线程安全  延时加载
 */
public class RegisterType {


    private static class RegisterSingleton {
        private static final RegisterType registerType = new RegisterType();
    }

    private RegisterType() {
    }

    //显式调用 getInstance 方法时，才会显式装载 RegisterSingleton 类
    public static final RegisterType getInstance() {
        return RegisterSingleton.registerType;
    }

    public static void main(String[] args) {

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] =
                new Thread(() -> System.out.println(RegisterType.getInstance().hashCode()));
            threads[i].start();
        }


    }


}
