package com.example.hotelbooking.Model;

import android.widget.ImageView;

public class Hotel {
    private int resourceid;
    private String name;
    private String location;
    private String price;
    private String discount;

    public Hotel(int resourceid, String name, String location, String price, String discount) {
        this.resourceid = resourceid;
        this.name = name;
        this.location = location;
        this.price = price;
        this.discount = discount;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getResourceid() {
        return resourceid;
    }

    public void setResourceid(int resourceid) {
        this.resourceid = resourceid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
