package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.models.ImagePlusTextModel;


public class ImagePlusTextViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    private ImageView imageView;

    public ImagePlusTextViewHolder(View view) {
        super(view);
        textView = view.findViewById(R.id.textView);
        imageView = view.findViewById(R.id.imageView);
    }

    public void bind(ImagePlusTextModel model) {
        textView.setText(model.getText());
        Glide.with(imageView.getContext()).load(model.getImageUrl()).into(imageView);
    }
}
