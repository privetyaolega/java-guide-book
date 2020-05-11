package com.eis.conspect.java.patterns.structural.facade.libraries;

import com.eis.conspect.java.patterns.structural.facade.libraries.codecs.Codec;

public class BitrateReader {

    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
