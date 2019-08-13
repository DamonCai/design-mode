package behavior.visitor;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.visitor
 * @date Date:2019/8/13 15:07
 *
 * 访问者接口
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
