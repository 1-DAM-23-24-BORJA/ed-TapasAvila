package com.iesam.tapasAvila.features.tapas.domain.tapa;

import java.util.ArrayList;

public class Tapa extends ArrayList<Tapa> {

    private String name;
    private String address;
    private String chef;
    private String ingredient;
    private String allergen;
    private String barName;
    private String photo;
    private  int rating ;
    private float price;

    private String id;

    public Tapa(String name, String address, String chef, String ingredient, String allergen, String barName, String photo, int rating, float price, String id) {
        this.name = name;
        this.address = address;
        this.chef = chef;
        this.ingredient = ingredient;
        this.allergen = allergen;
        this.barName = barName;
        this.photo = photo;
        this.rating = rating;
        this.price = price;
        this.id = id;
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

    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getAllergen() {
        return allergen;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen;
    }

    public String getBarName() {
        return barName;
    }

    public void setBarName(String barName) {
        this.barName = barName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tapa{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", chef='" + chef + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", allergen='" + allergen + '\'' +
                ", barName='" + barName + '\'' +
                ", photo='" + photo + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }
}
