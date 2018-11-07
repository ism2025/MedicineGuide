package com.example.basmatech.assignment2.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.basmatech.assignment2.R;

import java.util.ArrayList;

public class CountriesPhotoAdapter extends RecyclerView.Adapter<CountriesPhotoAdapter.MyViewHolder> {
    private ArrayList<Integer> list;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView country_photo_iv;

        public MyViewHolder(View itemView) {
            super(itemView);
            country_photo_iv = itemView.findViewById(R.id.country_photo_iv);
        }
    }

    public CountriesPhotoAdapter(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public CountriesPhotoAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_card_item, parent, false);
        return new CountriesPhotoAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        int photoId = list.get(position);
        holder.country_photo_iv.setImageResource(photoId);
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
