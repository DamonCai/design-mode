package j2ee.composite;


/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:j2ee.composite
 */
public class ZExecute {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }

}
