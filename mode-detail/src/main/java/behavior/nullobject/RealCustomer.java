package behavior.nullobject;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.nullobject
 * @date Date:2019/8/13 13:58
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
