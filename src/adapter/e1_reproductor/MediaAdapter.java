package adapter.e1_reproductor;

import adapter.e1_reproductor.interfaz.AdvancedMediaPlayer;
import adapter.e1_reproductor.interfaz.Mp4Player;
import adapter.e1_reproductor.interfaz.VlcPlayer;

public class MediaAdapter implements Mediaplayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(filename);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(filename);
        }
    }
}
