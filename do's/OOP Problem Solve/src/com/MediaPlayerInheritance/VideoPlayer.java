package com.MediaPlayerInheritance;

public class VideoPlayer extends MediaPlayer{
    VideoPlayer(){
        super.play();
        super.pause();
        super.stop();
    }
    public void seek(){
        System.out.println("Seeking for more Videos..........");
    }


}
