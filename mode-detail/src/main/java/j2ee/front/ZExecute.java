package j2ee.front;


/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:j2ee.front
 */
public class ZExecute {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
