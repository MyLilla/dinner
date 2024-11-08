package com.example.dinner.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private long id;
    private String name;
    private String category;
    private Integer calories;

}
