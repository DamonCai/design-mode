package behavior.state;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.state
 * @date Date:2019/8/13 10:32
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
