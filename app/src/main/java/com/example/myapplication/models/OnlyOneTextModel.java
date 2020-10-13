package com.example.myapplication.models;

public class OnlyOneTextModel implements UiItem {
    private String text;

    public OnlyOneTextModel(String value) {
        this.text = value;
    }

    public String getText() {
        return text;
    }
}