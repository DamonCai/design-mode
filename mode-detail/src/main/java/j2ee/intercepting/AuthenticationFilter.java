package j2ee.intercepting;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:j2ee.intercepting
 * @date Date:2019/8/13 16:43
 *
 * 创建实体过滤器。
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
