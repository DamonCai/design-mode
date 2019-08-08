package structure.adapter;

import structure.adapter.complex.AudioPlayer;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.factory
 */
public class ZExecute {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
