package com.example.farprojekt.Repository;

import com.example.farprojekt.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Repo implements IRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Product> fetchAll() {
        String sql = "SELECT * FROM kurland.Product";
        RowMapper<Product> rowMapper = new BeanPropertyRowMapper<>(Product.class);
        return jdbcTemplate.query(sql, rowMapper);
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
