package com.codemania.car_info_app;

public class CarDetails {
    String name;
    String info;
    int _img;

    public CarDetails() {
        this.name = null;
        this.info = null;
        this._img = 0;
    }
    public CarDetails(String name, String info, int _img) {
        this.name = name;
        this.info = info;
        this._img = _img;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void set_Img(int _img) {
        this._img = _img;
    }

    public String getName() {
        return name;
    }
    public String getInfo() {
        return info;
    }
    public int get_Img() {
        return _img;
    }

    @Override
    public String toString() {
        return "Car Name  : '" + name + '\'' + "Car Number: '" + info + '\'';
    }
}