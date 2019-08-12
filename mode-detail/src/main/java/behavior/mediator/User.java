package behavior.mediator;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.mediator
 * @date Date:2019/8/13 0:05
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
