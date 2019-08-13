package behavior.memento;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.memento
 * @date Date:2019/8/13 15:27
 *
 *
 * Memento 包含了要被恢复的对象的状态
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
