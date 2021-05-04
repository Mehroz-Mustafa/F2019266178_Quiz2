package com.codemania.car_info_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CarInfoAdapter.SelectedCarInfo {

    TextView txv_Title;
    TextView txv_Name;
    TextView txv_Info;
    ImageView img_Image;

    Button btn_CarInfo;
    Button btn_OwnerInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv_Name = findViewById(R.id.txv_name);
        txv_Info = findViewById(R.id.txv_info);
        txv_Title = findViewById(R.id.txv_title);
        img_Image = findViewById(R.id.img_owner);

        btn_CarInfo = findViewById(R.id.btn_car_info);
        btn_OwnerInfo = findViewById(R.id.btn_owner_info);
        onInfoClick(0);
    }

    @Override
    public void onInfoClick(int index) {
        txv_Title.setText("Car Details");
        txv_Name.setText(CarDetailsData.carDetails.get(index).getName());
        txv_Info.setText(CarDetailsData.carDetails.get(index).getInfo());
        img_Image.setImageResource(CarDetailsData.carDetails.get(index).get_Img());

        btn_CarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv_Title.setText("Car Details");
                txv_Name.setText(CarDetailsData.carDetails.get(index).getName());
                txv_Info.setText(CarDetailsData.carDetails.get(index).getInfo());
                img_Image.setImageResource(CarDetailsData.carDetails.get(index).get_Img());
            }
        });
        btn_OwnerInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv_Title.setText("Owner Details");
                txv_Name.setText(CarDetailsData.ownerDetails.get(index).getName());
                txv_Info.setText(CarDetailsData.ownerDetails.get(index).getInfo());
                img_Image.setImageResource(CarDetailsData.ownerDetails.get(index).get_Img());
            }
        });
    }
}