package behavior.nullobject;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.nullobject
 * @date Date:2019/8/13 13:58
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
