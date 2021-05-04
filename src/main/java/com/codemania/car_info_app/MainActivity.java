package com.codemania.car_info_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CarInfoAdapter.SelectedCarInfo {

    TextView txv_Name;
    TextView txv_Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv_Name = findViewById(R.id.txv_owner_name);
        txv_Info = findViewById(R.id.txv_owner_info);
        onInfoClick(0);
    }

    @Override
    public void onInfoClick(int index) {
        System.out.println("Demons Summoned 2");
        txv_Name.setText(CarDetailsData.carDetails.get(index).getCarName());
        txv_Info.setText(CarDetailsData.carDetails.get(index).getCarNumber());
    }
}