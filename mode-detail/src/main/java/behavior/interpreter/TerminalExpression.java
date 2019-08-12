package behavior.interpreter;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.interpreter
 * @date Date:2019/8/12 23:47
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
