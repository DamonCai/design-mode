package behavior.visitor;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.visitor
 * @date Date:2019/8/13 15:07
 *
 * 电脑零件接口
 */
public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);
}
