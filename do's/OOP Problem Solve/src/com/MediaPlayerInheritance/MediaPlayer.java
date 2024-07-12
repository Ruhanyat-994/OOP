package com.MediaPlayerInheritance;
/*Create a superclass MediaPlayer with methods play(), pause(), and stop().
Derive classes AudioPlayer and VideoPlayer from MediaPlayer.
 Each subclass should have additional methods (skip() for AudioPlayer, seek() for VideoPlayer).
Implement methods to perform these actions based on the media type.*/

public class MediaPlayer {
    public void play(){
        System.out.println("Playing...........");
    }
    public void pause(){
        System.out.println("Pausing..........");
    }
    public void stop(){
        System.out.println("Stopping..........");
    }


}
