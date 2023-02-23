package adapter.e1_reproductor;

public class AudioPlayer implements Mediaplayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 File: " + filename);
        } else if (audioType.equalsIgnoreCase("vlc") ||
                audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        }else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
