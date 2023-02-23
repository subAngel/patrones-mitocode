package adapter.e1_reproductor;

public class Demo {
    public static void main(String[] args) {
        AudioPlayer  audioPlayer = new AudioPlayer();

        audioPlayer.play("mp4", "unsonido.mp4");
        audioPlayer.play("mp3", "alone.mp3");
        audioPlayer.play("vlc", "pelicularandom.vlc");
        audioPlayer.play("avi", "pelicularandom2.avi");
    }
}
