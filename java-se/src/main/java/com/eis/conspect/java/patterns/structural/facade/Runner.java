package com.eis.conspect.java.patterns.structural.facade;

import com.eis.conspect.java.patterns.structural.facade.facade.VideoConversionFacade;

import java.io.File;

public class Runner {
    public static void main(String[] args) {

        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}