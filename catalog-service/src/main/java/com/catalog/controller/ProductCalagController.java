package com.catalog.controller;

import com.catalog.dto.Product;
import com.catalog.service.CatalgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class ProductCalagController {

    @Autowired
    private CatalgService service;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
    return service.addProduct(product);
    }

    @GetMapping("/getAll")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/groupByBrand/{brand}")
    public List<Product> getProductByBrand(@PathVariable String brand){
        return  service.findByProductBrand(brand);
    }

    @GetMapping("/groupByPrice/{price}")
    public List<Product> findProductBrandByPrice(@PathVariable double price){
        return  service.findProductBrandByPrice(price);
    }

    @GetMapping("/findCountByBrand/{brand}")
    public int findCountOfProductByBrand(@PathVariable String brand){
        return  service.findProductByProductBrand(brand);
    }
}
