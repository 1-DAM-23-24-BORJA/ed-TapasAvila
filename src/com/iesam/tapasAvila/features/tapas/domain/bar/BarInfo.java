package com.iesam.tapasAvila.features.tapas.domain.bar;

public class BarInfo {



    private  String name;
    private  String address;
    private  String owner;
    private  String hours;
    private  String phone;
    private  String idBar;


    public BarInfo(String name, String address, String owner, String hours, String phone, String idBar) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.hours = hours;
        this.phone = phone;
        this.idBar = idBar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdBar() {
        return idBar;
    }

    public void setIdBar(String idBar) {
        this.idBar = idBar;
    }

    @Override
    public String toString() {
        return "BarInfo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", owner='" + owner + '\'' +
                ", hours='" + hours + '\'' +
                ", phone='" + phone + '\'' +
                ", idBar='" + idBar + '\'' +
                '}';
    }
}
