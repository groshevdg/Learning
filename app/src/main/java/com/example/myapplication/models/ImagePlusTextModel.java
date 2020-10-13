package com.example.myapplication.models;

public class ImagePlusTextModel implements UiItem {

    private String text;
    private String imageUrl;

    public ImagePlusTextModel(String text, String imageUrl) {
        this.text = text;
        this.imageUrl = imageUrl;
    }

    public String getText() {
        return text;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
