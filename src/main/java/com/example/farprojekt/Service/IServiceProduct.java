package com.example.farprojekt.Service;

import com.example.farprojekt.Models.Product;

import java.util.List;

public interface IServiceProduct {

    List<Product> fetchAll();
    Product findProductById(int id);
    boolean addProduct(Product p);
    boolean deleteProduct(int id);
    boolean editProduct(int id);
}
