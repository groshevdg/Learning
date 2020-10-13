package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.models.ImagePlusTextModel;
import com.example.myapplication.models.OnlyOneTextModel;
import com.example.myapplication.models.UiItem;
import com.example.myapplication.models.VideoModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FeedRecyclerAdapter adapter = new FeedRecyclerAdapter();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        adapter.setDataList(getList());
    }

    List<UiItem> getList() {
        List<UiItem> dataList = new ArrayList<>();
        dataList.add(new ImagePlusTextModel("some text", "https://images-ext-2.discordapp.net/external/CZTLTOeVUbBSsqXxXtUeItK63SIX9u0ZsbUa_6fBW-E/https/otvet.imgsmail.ru/download/236718257_45088d515672b7e26e33817aa866852f_800.jpg"));
        dataList.add(new ImagePlusTextModel("some text", "https://images-ext-2.discordapp.net/external/CZTLTOeVUbBSsqXxXtUeItK63SIX9u0ZsbUa_6fBW-E/https/otvet.imgsmail.ru/download/236718257_45088d515672b7e26e33817aa866852f_800.jpg"));
        dataList.add(new OnlyOneTextModel("text text text text text text text text"));
        dataList.add(new OnlyOneTextModel("text text text text text text text text"));
        dataList.add(new VideoModel("https://wallpapertag.com/wallpaper/full/6/8/9/664252-best-waterfall-background-pictures-1920x1200.jpg"));
        dataList.add(new ImagePlusTextModel("some text", "https://yt3.ggpht.com/a/AATXAJwf3FgGzWht9leZX_jdD5DWen7QN-DPyvIiiGEZ=s900-c-k-c0xffffffff-no-rj-mo"));
        dataList.add(new OnlyOneTextModel("text text text text text text text text"));
        dataList.add(new ImagePlusTextModel("some text", "https://wallpapertag.com/wallpaper/full/6/8/9/664252-best-waterfall-background-pictures-1920x1200.jpg"));

        return dataList;
    }
}