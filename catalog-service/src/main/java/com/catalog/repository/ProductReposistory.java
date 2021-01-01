package com.catalog.repository;

import com.catalog.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductReposistory extends JpaRepository<Product,Long> {
    public Product findByProductId(Long id);
    public List<Product> findByProductBrand(String brand);
    public List<Product> findProductBrandByProductPrice(double price);

    //@Query("select p from Product p where p.productBrand=?1")
    public int countTotalProductsByProductBrand(String brand);
}
