package com.devices;
import com.sibsutis.Printable;

public abstract class Device implements Printable{
    private int id;
    private int price;
    private String ip;

    public Device(int id, int price, String ip){
        this.id = id;
        this.price = price;
        this.ip = ip;
    }

    public abstract String getDeviceType();

    @Override
    public String print(){
        return String.format("%d %d %s", id, price, ip, getDeviceType());
    }

    public int getId(){return id;}
    public int getPrice(){return price;}
    public String getIp(){return ip;}


    @Override
    public boolean equals(Object o){
        if (this == o){return true};
        if (o == null || getClass() != o.getClass()){return false};
        Device deviceObj = (Device) o;
        return id == deviceObj.id && price == deviceObj.price && java.util.Objects.equals(ip, deviceObj.ip);
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(id, price, ip);
    }

    
    
}