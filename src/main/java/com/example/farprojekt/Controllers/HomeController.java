package com.example.farprojekt.Controllers;

import com.example.farprojekt.Models.Product;
import com.example.farprojekt.Service.IServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    IServiceProduct serviceProduct;

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/addProduct")
    public String addProduct(){
        return "add_product";
    }

    @PostMapping("/addProduct")
    public String addProduct(Product product){

        return "redirect:/";
    }

    @GetMapping("/products")
    public String products(Model model){
        List<Product> products = serviceProduct.fetchAll();
        model.addAttribute("produkter", products);
        return "products";
    }
}
