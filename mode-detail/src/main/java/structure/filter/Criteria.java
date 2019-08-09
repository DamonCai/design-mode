package structure.filter;

import java.util.List;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.filter
 * @date Date:2019/8/9 11:50
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
