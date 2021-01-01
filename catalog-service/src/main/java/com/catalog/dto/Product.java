package com.catalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {

    @GeneratedValue
    @Id
    private Long productId;
    private String productName;
    private String productBrand;
    private double productPrice;
    private String productColour;
    private String productSize;
}
