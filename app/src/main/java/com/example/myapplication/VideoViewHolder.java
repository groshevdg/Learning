package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.models.VideoModel;


public class VideoViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;

    public VideoViewHolder(View view) {
        super(view);
        imageView = view.findViewById(R.id.video);
    }

    public void bind(VideoModel model) {
       // Glide.with(imageView).load(model.getVideoUrl()).into(imageView);
    }
}
