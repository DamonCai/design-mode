package structure.adapter.complex;

import structure.adapter.complex.AdvancedMediaPlayer;
import structure.adapter.complex.Mp4Player;
import structure.adapter.complex.VlcPlayer;
import structure.adapter.complex.MediaPlayer;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.adapter
 * @date Date:2019/8/8 20:13
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
