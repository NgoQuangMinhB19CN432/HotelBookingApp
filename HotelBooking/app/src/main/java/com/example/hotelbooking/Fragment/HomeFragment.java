package com.example.hotelbooking.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelbooking.Model.Hotel;
import com.example.hotelbooking.Adapter.HotelAdapter;
import com.example.hotelbooking.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView rcv = view.findViewById(R.id.rcv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        rcv.setLayoutManager(layoutManager);
        HotelAdapter hotelAdapter = new HotelAdapter(getContext());
        hotelAdapter.setData(getListHotel());
        rcv.setAdapter(hotelAdapter);
        return view;
    }
    private List<Hotel> getListHotel(){
        List<Hotel> list = new ArrayList<>();
        list.add(new Hotel(R.drawable.hera, "Hera Boutique Hotel", "Ha Noi, Viet Nam", "500.000", "-50%"));
        list.add(new Hotel(R.drawable.escalade, "Escalade Hotel", "Da Lat, Viet Nam", "1.050.000", "-39%"));
        list.add(new Hotel(R.drawable.lumina, "Lumina Villas", "Phu Quoc,Viet Nam", "1.050.000", "-20%"));
        list.add(new Hotel(R.drawable.alma, "Alma Resort", "Cam Ranh,Viet Nam", "1.050.000", "-40%"));
        return list;
    }
    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

}
