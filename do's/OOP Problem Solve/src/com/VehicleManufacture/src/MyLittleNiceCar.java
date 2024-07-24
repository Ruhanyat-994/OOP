public class MyLittleNiceCar {

    Engine engine ;
    MediaPlayer media ;
    public MyLittleNiceCar(){
        engine = new EngineType();
        media = new CdPlayer();
    }
    public MyLittleNiceCar(Engine engine){
        this.engine = engine;
    }
    public MyLittleNiceCar(MediaPlayer media){
        this.media = media;
    }
    public void getEngineName(){
        engine.getEngineName();
    }

    public void startPlaying(){
        media.startPlaying();
    }
    public void stopPlaying(){
        media.stopPlaying();
    }
    public void  resumePlaying(){
        media.resumePlaying();
    }
    public void skipPlaying(){
        media.skipPlaying();
    }

}
