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
    ArrayList<CarDetails> carDetails;

    public CarInfoAdapter(Context context, ArrayList<CarDetails> list) {
        carDetails = list;
        selectedCarInfo = (SelectedCarInfo) context;
    }

    public interface SelectedCarInfo {
        public void onInfoClick(int index);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txv_Name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txv_Name = itemView.findViewById(R.id.txv_name_title);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //System.out.println("Demons Summoned 1");
                    selectedCarInfo.onInfoClick(carDetails.indexOf((CarDetails)itemView.getTag()));
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
        holder.txv_Name.setText(carDetails.get(position).getName());
        holder.itemView.setTag(carDetails.get(position));
    }

    @Override
    public int getItemCount() {
        return carDetails.size();
    }
}