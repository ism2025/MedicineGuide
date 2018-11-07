package com.example.basmatech.assignment2.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.basmatech.assignment2.model.Country;
import com.example.basmatech.assignment2.R;

import java.util.ArrayList;


public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<Country> list;
    ArrayList<Integer> countryPhotosId;
    RecyclerView country_photo_rv;
    CountriesPhotoAdapter adapter;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView country_flag_list;
        TextView country_name_list;
//        RadioButton radio_btn;

        public MyViewHolder(View itemView) {
            super(itemView);
            country_flag_list = itemView.findViewById(R.id.country_photo_iv);
            country_name_list = itemView.findViewById(R.id.country_name_list);
//            radio_btn = itemView.findViewById(R.id.radio_btn);
//            country_photo_rv = itemView.findViewById(R.id.country_photo_rv);
        }

    }


    public CountriesAdapter(Context context, ArrayList<Country> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.spinner_item, parent, false);
        return new CountriesAdapter.MyViewHolder(itemView);
    }

    private RadioButton lastCheckedRB = null;

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Country country = list.get(position);
        holder.country_flag_list.setImageResource(country.getCountryFlag());
        holder.country_name_list.setText(country.getCountryName());
//        holder.radio_btn.setOnCheckedChangeListener(new Radio);
//                countryPhotosId = country.getCountryPhotos();
        adapter = new CountriesPhotoAdapter(countryPhotosId);

//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(null, LinearLayoutManager.HORIZONTAL, false);
//        country_photo_rv.setLayoutManager(layoutManager);
//        country_photo_rv.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
