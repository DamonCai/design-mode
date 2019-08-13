package behavior.template;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.template
 * @date Date:2019/8/13 14:56
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
