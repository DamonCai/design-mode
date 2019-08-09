package structure.proxy;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.proxy
 * @date Date:2019/8/9 16:51
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
