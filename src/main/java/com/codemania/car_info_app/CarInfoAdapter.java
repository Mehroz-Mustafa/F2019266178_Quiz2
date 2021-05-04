package com.codemania.car_info_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
        TextView txv_Owner;
        ImageView img_CarImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img_CarImage = itemView.findViewById(R.id.img_car_image);
            txv_Name = itemView.findViewById(R.id.txv_car_title);
            txv_Owner = itemView.findViewById(R.id.txv_owner_title);

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
        holder.txv_Owner.setText(carDetails.get(position).getInfo());
        holder.itemView.setTag(carDetails.get(position));

        switch (carDetails.get(position).getName()) {
            case "Volkswagen":
                holder.img_CarImage.setImageResource(R.drawable.volkswagen);
                break;
            case "Nissan":
                holder.img_CarImage.setImageResource(R.drawable.nissan);
                break;
            case "Mercedes":
                holder.img_CarImage.setImageResource(R.drawable.mercedes);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return carDetails.size();
    }
}