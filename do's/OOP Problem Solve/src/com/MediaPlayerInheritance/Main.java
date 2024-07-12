package com.MediaPlayerInheritance;

public class Main {

    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        AudioPlayer audioPlayer = new AudioPlayer();

        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.seek();
        audioPlayer.skip();
        audioPlayer.pause();
    }


}
