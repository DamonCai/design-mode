package structure.chain;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.chain
 * @date Date:2019/8/9 16:57
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
