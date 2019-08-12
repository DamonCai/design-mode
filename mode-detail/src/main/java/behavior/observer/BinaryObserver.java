package behavior.observer;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.observer
 * @date Date:2019/8/13 0:12
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
