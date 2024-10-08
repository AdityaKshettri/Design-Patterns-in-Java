package com.aditya.project.structural.proxy;

import com.aditya.project.structural.proxy.app.YouTubeDownloader;
import com.aditya.project.structural.proxy.service.YouTubeCacheProxy;
import com.aditya.project.structural.proxy.service.YouTubeServiceImpl;

public class Main {

    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new YouTubeServiceImpl());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.println("Time saved for caching proxy: " + (naive - smart) + " ms");
    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");

        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");

        return estimatedTime;
    }
}


