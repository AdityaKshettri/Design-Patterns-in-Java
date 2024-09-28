package com.aditya.project.structural.facade;

import com.aditya.project.structural.facade.facades.VideoConversionFacade;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
