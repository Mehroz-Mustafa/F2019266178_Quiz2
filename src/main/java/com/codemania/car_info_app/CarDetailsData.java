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
        carDetails.add(new CarDetails("Car Name: A", "Car NumberPlate: ABC-1001"));
        carDetails.add(new CarDetails("Car Name: B", "Car NumberPlate: ABC-1002"));
        carDetails.add(new CarDetails("Car Name: C", "Car NumberPlate: ABC-1003"));
        carDetails.add(new CarDetails("Car Name: D", "Car NumberPlate: ABC-1004"));
        carDetails.add(new CarDetails("Car Name: E", "Car NumberPlate: ABC-1005"));

        ownerDetails = new ArrayList<>();
        ownerDetails.add(new CarDetails("Owner Name: Z", "Owner number: 090078601"));
        ownerDetails.add(new CarDetails("Owner Name: Y", "Owner number: 090078602"));
        ownerDetails.add(new CarDetails("Owner Name: X", "Owner number: 090078603"));
        ownerDetails.add(new CarDetails("Owner Name: W", "Owner number: 090078604"));
        ownerDetails.add(new CarDetails("Owner Name: V", "Owner number: 090078605"));
    }

}