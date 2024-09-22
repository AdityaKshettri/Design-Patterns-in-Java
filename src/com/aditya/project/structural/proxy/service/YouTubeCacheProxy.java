package com.aditya.project.structural.proxy.service;

import com.aditya.project.structural.proxy.model.Video;

import java.util.HashMap;
import java.util.Map;

public class YouTubeCacheProxy implements YouTubeService {

    private final YouTubeService service;
    private final Map<String, Video> cacheAll = new HashMap<>();
    private Map<String, Video> cachePopular = new HashMap<>();

    public YouTubeCacheProxy() {
        service = new YouTubeServiceImpl();
    }

    @Override
    public Map<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = service.popularVideos();
        } else {
            System.out.println("Retrieved videos from Cache");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = service.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video from cache, id: " + videoId);
        }
        return video;
    }

    public void reset() {
        cacheAll.clear();
        cachePopular.clear();
    }
}
