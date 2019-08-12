package structure.chain;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.chain
 * @date Date:2019/8/9 16:58
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
