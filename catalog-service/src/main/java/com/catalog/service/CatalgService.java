package com.catalog.service;

import com.catalog.dto.Product;
import com.catalog.repository.ProductReposistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalgService {

    @Autowired
    public ProductReposistory repository;

    public Product addProduct(Product product){
        return repository.save(product);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public List<Product> findByProductBrand(String brand){
        return repository.findByProductBrand(brand);
    }
    public List<Product> findProductBrandByPrice(double price){
        return repository.findProductBrandByProductPrice(price);
    }
    public int findProductByProductBrand(String brand){
        return  repository.countTotalProductsByProductBrand(brand);
    }
}
