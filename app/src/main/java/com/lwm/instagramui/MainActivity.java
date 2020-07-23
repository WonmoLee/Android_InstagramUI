package com.lwm.instagramui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Movie;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private RecyclerView rvTitle;
    private RecyclerView rvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTitle = findViewById(R.id.rv_title);
        rvContent = findViewById(R.id.rv_content);

        com.lwm.instagramui.TitleAdapter titleAdapter = new com.lwm.instagramui.TitleAdapter();
        titleAdapter.addItem(new Title("길동이", R.drawable.propic1));
        titleAdapter.addItem(new Title("바다",R.drawable.propic2));
        titleAdapter.addItem(new Title("난 누구지",R.drawable.propic3));
        titleAdapter.addItem(new Title("이런이런", R.drawable.propic4));
        titleAdapter.addItem(new Title("하늘",R.drawable.postpic1));
        titleAdapter.addItem(new Title("보라",R.drawable.postpic2));
        titleAdapter.addItem(new Title("초록",R.drawable.postpic3));
        titleAdapter.addItem(new Title("검정",R.drawable.postpic4));

        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        rvTitle.setLayoutManager(layoutManager1);
        rvTitle.setAdapter(titleAdapter);

        com.lwm.instagramui.ContentAdapter contentAdapter = new com.lwm.instagramui.ContentAdapter();
        contentAdapter.addItem(new Content(R.drawable.postpic1));
        contentAdapter.addItem(new Content(R.drawable.postpic2));
        contentAdapter.addItem(new Content(R.drawable.postpic3));
        contentAdapter.addItem(new Content(R.drawable.postpic4));
        contentAdapter.addItem(new Content(R.drawable.postpic5));

        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(this);
        rvContent.setLayoutManager(layoutManager2);
        rvContent.setAdapter(contentAdapter);


    }
}