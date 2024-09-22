package com.aditya.project.structural.proxy.app;

import com.aditya.project.structural.proxy.model.Video;
import com.aditya.project.structural.proxy.service.YouTubeService;

import java.util.Map;

public class YouTubeDownloader {

    private final YouTubeService service;

    public YouTubeDownloader(YouTubeService service) {
        this.service = service;
    }

    public void renderVideoPage(String videoId) {
        Video video = service.getVideo(videoId);
        System.out.println("ID: " + video.id);
        System.out.println("TITLE: " + video.title);
        System.out.println("VIDEO: " + video.data);
    }

    public void renderPopularVideos() {
        Map<String, Video> list = service.popularVideos();
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }
    }
}
