package com.MediaPlayerInheritance;

public class AudioPlayer extends MediaPlayer{
    AudioPlayer(){
        super.play();
        super.pause();
        super.stop();
    }
    public void skip(){
        System.out.println("Skiping the to next..........");
    }


}
