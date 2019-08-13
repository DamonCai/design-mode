package behavior.visitor;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.visitor
 */
public class ZExecute {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
