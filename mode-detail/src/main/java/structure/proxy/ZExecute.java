package structure.proxy;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.proxy
 */
public class ZExecute {


    public static void main(String[] args) {

        Image image = new ProxyImage("test_10mb.jpg");

        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }


}
