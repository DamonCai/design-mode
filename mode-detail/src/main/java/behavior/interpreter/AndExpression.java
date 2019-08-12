package behavior.interpreter;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.interpreter
 * @date Date:2019/8/12 23:49
 */
public class AndExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
