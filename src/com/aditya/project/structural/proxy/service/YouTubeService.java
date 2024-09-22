package com.aditya.project.structural.proxy.service;

import com.aditya.project.structural.proxy.model.Video;

import java.util.Map;

public interface YouTubeService {

    Map<String, Video> popularVideos();

    Video getVideo(String videoId);
}
