package com.codemania.car_info_app;

import android.app.Application;

import java.util.ArrayList;

public class CarDetailsData extends Application {
    public static ArrayList<CarDetails> carDetails;
    public static ArrayList<CarDetails> ownerDetails;

    @Override
    public void onCreate() {
        super.onCreate();
        carDetails = new ArrayList<>();
        carDetails.add(new CarDetails("Volkswagen", "ABC-1001", R.drawable.volkswagen));
        carDetails.add(new CarDetails("Mercedes", "ABC-1002", R.drawable.mercedes));
        carDetails.add(new CarDetails("Nissan", "ABC-1003", R.drawable.nissan));
        carDetails.add(new CarDetails("Mercedes", "ABC-1004", R.drawable.mercedes));
        carDetails.add(new CarDetails("Volkswagen", "ABC-1005", R.drawable.volkswagen));

        ownerDetails = new ArrayList<>();
        ownerDetails.add(new CarDetails("Zam zam", "090078601", R.drawable.vta_user));
        ownerDetails.add(new CarDetails("Yalli", "090078602", R.drawable.vta_user));
        ownerDetails.add(new CarDetails("X men", "090078603", R.drawable.vta_user));
        ownerDetails.add(new CarDetails("Wonder man", "090078604", R.drawable.vta_user));
        ownerDetails.add(new CarDetails("Vendor", "090078605", R.drawable.vta_user));
    }

}