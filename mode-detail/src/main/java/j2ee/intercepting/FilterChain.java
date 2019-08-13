package j2ee.intercepting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:j2ee.intercepting
 * @date Date:2019/8/13 16:44
 *
 * 创建过滤器链。
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList();
    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
