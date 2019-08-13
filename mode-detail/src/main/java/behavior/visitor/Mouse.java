package behavior.visitor;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.visitor
 * @date Date:2019/8/13 15:09
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
