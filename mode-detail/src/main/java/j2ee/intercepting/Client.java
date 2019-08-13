package j2ee.intercepting;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:j2ee.intercepting
 * @date Date:2019/8/13 16:47
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
