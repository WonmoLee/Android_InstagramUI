package com.lwm.instagramui;

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

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.MyViewHolder> {

    private static final String TAG = "MovieAdapter";

    private List<Title> items = new ArrayList<>();

    public void addItem(Title title) {
        items.add(title);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_profile, parent, false);

        Log.d(TAG, "onCreateViewHolder: 껍데기 만들기");

        return new MyViewHolder(view);
    }

    // 껍데기에 데이터 바인딩 해줌. 2번으로 실행
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: 데이터 바인딩");
        Title title = items.get(position);
        holder.setItem(title);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView ivImgResource;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.tv_username);
            ivImgResource = itemView.findViewById(R.id.iv_img_resource2);
        }

        public void setItem(Title title) {
            textView.setText(title.getUsername());
            ivImgResource.setImageResource(title.getImgResource());
        }
    }
}
