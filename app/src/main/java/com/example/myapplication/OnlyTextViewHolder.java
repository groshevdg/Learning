package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.models.OnlyOneTextModel;

public class OnlyTextViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;

    public OnlyTextViewHolder(View view) {
        super(view);
        textView = view.findViewById(R.id.textView);
    }

    public void bind(OnlyOneTextModel model) {
        textView.setText(model.getText());
    }
}
