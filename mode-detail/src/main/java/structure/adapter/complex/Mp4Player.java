package structure.adapter.complex;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.adapter
 * @date Date:2019/8/8 20:05
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
