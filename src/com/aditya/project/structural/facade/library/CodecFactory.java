package com.aditya.project.structural.facade.library;

public class CodecFactory {

    public static CodecType extract(VideoFile file) {
        String type = file.getCodecType();
        return CodecType.valueOf(type.toUpperCase());
    }
}
