package behavior.state;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.state
 *
 *
 * 在context的场景中，取其开始，结束的状态
 */
public class ZExecute {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }

}
