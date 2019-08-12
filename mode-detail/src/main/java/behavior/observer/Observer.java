package behavior.observer;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.observer
 * @date Date:2019/8/13 0:11
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
