package com.codemania.car_info_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarInfoAdapter extends RecyclerView.Adapter<CarInfoAdapter.ViewHolder> {

    SelectedCarInfo selectedCarInfo;
    ArrayList<CarInfo> carInfo;

    public CarInfoAdapter(Context context, ArrayList<CarInfo> list) {
        carInfo = list;
        selectedCarInfo = (SelectedCarInfo) context;
    }


    public interface SelectedCarInfo {
        public void onInfoClick(int index);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txv_Name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txv_Name = itemView.findViewById(R.id.txv_name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    System.out.println("Demons Summoned 1");
                    selectedCarInfo.onInfoClick(carInfo.indexOf((CarInfo)itemView.getTag()));
                }
            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txv_Name.setText(carInfo.get(position).getCarName());
        holder.txv_Name.setTag(carInfo.get(position).getCarNumber());
    }

    @Override
    public int getItemCount() {
        return carInfo.size();
    }
}