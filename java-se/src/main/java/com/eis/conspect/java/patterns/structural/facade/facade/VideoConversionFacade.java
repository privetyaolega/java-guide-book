package com.eis.conspect.java.patterns.structural.facade.facade;

import com.eis.conspect.java.patterns.structural.facade.libraries.AudioMixer;
import com.eis.conspect.java.patterns.structural.facade.libraries.BitrateReader;
import com.eis.conspect.java.patterns.structural.facade.libraries.VideoFile;
import com.eis.conspect.java.patterns.structural.facade.libraries.codecs.Codec;
import com.eis.conspect.java.patterns.structural.facade.libraries.codecs.CodecFactory;
import com.eis.conspect.java.patterns.structural.facade.libraries.codecs.MPEG4CompressionCodec;
import com.eis.conspect.java.patterns.structural.facade.libraries.codecs.OggCompressionCodec;

import java.io.File;

public class VideoConversionFacade {

    public File convertVideo(String fileName, String format) {

        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
