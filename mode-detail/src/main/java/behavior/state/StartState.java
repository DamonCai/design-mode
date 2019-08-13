package behavior.state;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.state
 * @date Date:2019/8/13 10:31
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
