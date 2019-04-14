package com.example.farprojekt.Models;

public class Product {

    private int id;
    private String name;
    private int stack;
    private int price;
    private String picture;
    private String description;

    public Product() {
    }

    public Product(int id, String name, int stack, int price, String picture, String description) {
        this.id = id;
        this.name = name;
        this.stack = stack;
        this.price = price;
        this.picture = picture;
        this.description = description;
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

    public int getStack() {
        return stack;
    }

    public void setStack(int stack) {
        this.stack = stack;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stack=" + stack +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
