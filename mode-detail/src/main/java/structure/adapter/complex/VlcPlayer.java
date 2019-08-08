package structure.adapter.complex;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.adapter
 * @date Date:2019/8/8 20:05
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
