package behavior.template;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.template
 * @date Date:2019/8/13 14:36
 *
 *
 * 固定游戏的模板，让各个游戏重写初始化，启动，结束的方法
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //模板
    public final void play() {

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
