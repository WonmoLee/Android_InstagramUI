package com.lwm.instagramui;

import android.graphics.Movie;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.MyViewHolder> {

    private static final String TAG = "MovieAdapter";

    private List<Content> items = new ArrayList<>();

    public void addItem(Content content) {
        items.add(content);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_content, parent, false);

        Log.d(TAG, "onCreateViewHolder: 껍데기 만들기");

        return new MyViewHolder(view);
    }

    // 껍데기에 데이터 바인딩 해줌. 2번으로 실행
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: 데이터 바인딩");
        Content content = items.get(position);
        holder.setItem(content);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivImgResource;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ivImgResource = itemView.findViewById(R.id.iv_img_resource);
        }

        // 규칙 3
        public void setItem(Content content) {
            ivImgResource.setImageResource(content.getImgResource());
        }
    }
}
