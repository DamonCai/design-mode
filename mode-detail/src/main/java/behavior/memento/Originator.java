package behavior.memento;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.memento
 * @date Date:2019/8/13 15:27
 *
 * 创建Originator 并在 Memento 对象中存储状态
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }
}
