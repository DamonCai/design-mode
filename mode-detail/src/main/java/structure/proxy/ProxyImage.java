package structure.proxy;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.proxy
 * @date Date:2019/8/9 16:51
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
