package com.example.hotelbooking.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelbooking.Model.Hotel;
import com.example.hotelbooking.R;

import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder>
{
    private Context context;
    private List<Hotel> listHotel;
    private HotelAdapter adapter;
    private SearchView sv;
    public HotelAdapter(Context context) {
        this.context = context;
    }
    public void setData(List<Hotel> list){
        this.listHotel =list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {
        Hotel hotel = listHotel.get(position);
        if(hotel == null){
            return;
        }
        holder.hotel_img.setImageResource(hotel.getResourceid());
        holder.hotel_name.setText(hotel.getName());
        holder.hotel_location.setText(hotel.getLocation());
        holder.hotel_price.setText(hotel.getPrice());
        holder.hotel_discount.setText(hotel.getDiscount());
    }

    @Override
    public int getItemCount() {
        if(listHotel != null){
            return listHotel.size();
        }
        return 0;
    }

    public class HotelViewHolder extends RecyclerView.ViewHolder{
        private ImageView hotel_img;
        private TextView hotel_name;
        private TextView hotel_location;
        private TextView hotel_price;
        private TextView hotel_discount;

        public HotelViewHolder(@NonNull View itemView) {
            super(itemView);

            hotel_img = itemView.findViewById(R.id.hotel_img);
            hotel_name = itemView.findViewById(R.id.hotel_name);
            hotel_location = itemView.findViewById(R.id.hotel_location);
            hotel_price = itemView.findViewById(R.id.hotel_price);
            hotel_discount = itemView.findViewById(R.id.hotel_discount);
        }
    }

}

