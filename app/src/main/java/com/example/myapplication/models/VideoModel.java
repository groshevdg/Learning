package com.example.myapplication.models;

public class VideoModel implements UiItem {
    private String videoUrl;

    public VideoModel(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }
}
