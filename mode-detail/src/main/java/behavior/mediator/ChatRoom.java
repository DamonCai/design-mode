package behavior.mediator;

import java.util.Date;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.mediator
 * @date Date:2019/8/13 0:05
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
