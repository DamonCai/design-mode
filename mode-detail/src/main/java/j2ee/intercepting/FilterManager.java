package j2ee.intercepting;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:j2ee.intercepting
 * @date Date:2019/8/13 16:46
 *
 * 创建过滤管理器。
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}
