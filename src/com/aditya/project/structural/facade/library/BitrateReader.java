package com.aditya.project.structural.facade.library;

public class BitrateReader {
    public static VideoFile read(VideoFile file, CodecType codecType) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, CodecType codecType) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
