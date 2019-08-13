package behavior.nullobject;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.nullobject
 * @date Date:2019/8/13 13:59
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
