package j2ee.front;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:j2ee.front
 * @date Date:2019/8/13 16:35
 */
public class FrontController {

    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(String request) {
        System.out.println("User is authenticated successfully." + request);
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request) {
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if (isAuthenticUser(request)) {
            dispatcher.dispatch(request);
        }
    }
}
