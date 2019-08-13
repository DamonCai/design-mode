package j2ee.servicelocator;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:j2ee.servicelocator
 * @date Date:2019/8/13 16:54
 */
public class Service1 implements Service {

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
