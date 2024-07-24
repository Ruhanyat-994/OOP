

public class CdPlayer implements MediaPlayer{
    @Override
    public void startPlaying() {
        System.out.println("Starting the Surah!");
    }

    @Override
    public void stopPlaying() {

        System.out.println("Stopping the Surah!");
    }

    @Override
    public void resumePlaying() {
        System.out.println("Resuming the Surah!");
    }

    @Override
    public void skipPlaying() {
        System.out.println("Skipping through Juzz!");
    }
}
