package com.example.farprojekt.Service;

import com.example.farprojekt.Models.Product;
import com.example.farprojekt.Repository.IRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduct implements IServiceProduct {

    @Autowired
    IRepo repo;

    @Override
    public List<Product> fetchAll() {

        return repo.fetchAll();
    }

    @Override
    public Product findProductById(int id) {
        return null;
    }

    @Override
    public boolean addProduct(Product p) {
        return false;
    }

    @Override
    public boolean deleteProduct(int id) {
        return false;
    }

    @Override
    public boolean editProduct(int id) {
        return false;
    }
}
