package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.models.ImagePlusTextModel;
import com.example.myapplication.models.OnlyOneTextModel;
import com.example.myapplication.models.UiItem;
import com.example.myapplication.models.VideoModel;

import java.util.ArrayList;
import java.util.List;

public class FeedRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<UiItem> dataList = new ArrayList<>();

    public void setDataList(List<UiItem> dataList) {
        this.dataList.clear();
        this.dataList.addAll(dataList);
        this.notifyDataSetChanged();
    }

    private static int ONLY_TEXT_KEY = 0;
    private static int IMAGE_PLUS_TEXT_KEY = 1;
    private static int VIDEO_KEY = 2;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == ONLY_TEXT_KEY) {
            return new OnlyTextViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_only_text_feed, parent, false));
        } else if (viewType == IMAGE_PLUS_TEXT_KEY) {
            return new ImagePlusTextViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_image_plus_text_feed, parent, false));
        } else {
            return new VideoViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_video_feed, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof OnlyTextViewHolder) {
            ((OnlyTextViewHolder) holder).bind((OnlyOneTextModel) dataList.get(position));
        } else if (holder instanceof ImagePlusTextViewHolder) {
            ((ImagePlusTextViewHolder) holder).bind((ImagePlusTextModel) dataList.get(position));
        } else {
            ((VideoViewHolder) holder).bind((VideoModel) dataList.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (dataList.get(position) instanceof OnlyOneTextModel) {
            return ONLY_TEXT_KEY;
        } else if (dataList.get(position) instanceof ImagePlusTextModel) {
            return IMAGE_PLUS_TEXT_KEY;
        } else return VIDEO_KEY;
    }
}