package com.example.viewpager2andtablayout;

public class Product {
    private int id;
    private String name;
    private int image;
    private double price;
    private String category;

    public Product(int id, String name, int image, double price,String category) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.category=category;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
