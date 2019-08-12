package behavior.chain;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.chain
 * @date Date:2019/8/9 16:55
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
