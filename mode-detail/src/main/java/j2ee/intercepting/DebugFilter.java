package j2ee.intercepting;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:j2ee.intercepting
 * @date Date:2019/8/13 16:43
 */
public class DebugFilter implements Filter {
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
