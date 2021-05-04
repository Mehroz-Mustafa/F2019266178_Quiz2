package com.codemania.car_info_app;

public class CarInfo {
    String carName;
    String carNumber;

    public CarInfo() {
        this.carName = null;
        this.carNumber = null;
    }
    public CarInfo(String carName, String carNumber) {
        this.carName = carName;
        this.carNumber = carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
    public String getCarNumber() {
        return carNumber;
    }

    @Override
    public String toString() {
        return "Car Name  : '" + carName + '\'' + "Car Number: '" + carNumber + '\'';
    }
}
