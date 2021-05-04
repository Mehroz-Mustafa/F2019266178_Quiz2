package com.codemania.car_info_app;

public class CarDetails {
    String name;
    String info;

    public CarDetails() {
        this.name = null;
        this.info = null;
    }
    public CarDetails(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Car Name  : '" + name + '\'' + "Car Number: '" + info + '\'';
    }
}