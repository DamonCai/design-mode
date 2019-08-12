package behavior.observer;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.observer
 */
public class ZExecute {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

}
