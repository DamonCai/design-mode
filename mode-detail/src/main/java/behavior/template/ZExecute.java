package behavior.template;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.template
 */
public class ZExecute {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
