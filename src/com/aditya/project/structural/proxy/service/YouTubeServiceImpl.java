package com.aditya.project.structural.proxy.service;

import com.aditya.project.structural.proxy.model.Video;

import java.util.HashMap;
import java.util.Map;

public class YouTubeServiceImpl implements YouTubeService {

    @Override
    public Map<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        return getSomeVideo(videoId);
    }

    /*
     * Fake methods to simulate network activity. They as slow as a real life.
     */

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    private Map<String, Video> getRandomVideos() {
        System.out.print("Downloading populars... ");
        experienceNetworkLatency();

        Map<String, Video> map = new HashMap<>();
        map.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        map.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        map.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        map.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        map.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.print("Done!" + "\n");
        return map;
    }

    private Video getSomeVideo(String videoId) {
        System.out.print("Downloading video... ");
        experienceNetworkLatency();

        Video video = new Video(videoId, "Some video title");

        System.out.print("Done!" + "\n");
        return video;
    }
}
