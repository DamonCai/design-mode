package behavior.state;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.state
 * @date Date:2019/8/13 10:17
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
