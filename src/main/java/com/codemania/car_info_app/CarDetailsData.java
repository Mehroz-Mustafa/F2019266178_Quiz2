package com.codemania.car_info_app;

import android.app.Application;

import java.util.ArrayList;

public class CarDetailsData extends Application {
    public static ArrayList<CarInfo> carDetails;

    @Override
    public void onCreate() {
        super.onCreate();
        carDetails = new ArrayList<>();
        carDetails.add(new CarInfo("A", "ABC-1001"));
        carDetails.add(new CarInfo("B", "ABC-1002"));
        carDetails.add(new CarInfo("C", "ABC-1003"));
        carDetails.add(new CarInfo("D", "ABC-1004"));
        carDetails.add(new CarInfo("E", "ABC-1005"));
        //repeat these.

    }
}
