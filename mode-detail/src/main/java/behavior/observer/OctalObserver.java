package behavior.observer;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.observer
 * @date Date:2019/8/13 0:14
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
