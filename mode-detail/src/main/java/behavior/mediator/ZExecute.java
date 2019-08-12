package behavior.mediator;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.mediator
 *
 *
 * 使用 User 对象来显示他们之间的通信。
 */
public class ZExecute {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}
