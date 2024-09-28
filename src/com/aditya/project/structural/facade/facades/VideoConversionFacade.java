package com.aditya.project.structural.facade.facades;

import com.aditya.project.structural.facade.library.AudioMixer;
import com.aditya.project.structural.facade.library.BitrateReader;
import com.aditya.project.structural.facade.library.CodecFactory;
import com.aditya.project.structural.facade.library.CodecType;
import com.aditya.project.structural.facade.library.VideoFile;

import java.io.File;

public class VideoConversionFacade {

    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        CodecType sourceCodec = CodecFactory.extract(file);
        CodecType destinationCodec = format.equals("mp4") ? CodecType.MP4 : CodecType.OGG;
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
