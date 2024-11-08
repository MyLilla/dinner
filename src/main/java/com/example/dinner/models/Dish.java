package com.example.dinner.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;


@Data
@AllArgsConstructor
public class Dish {

    private Long id;
    private String name;
    private String category;
    private Integer cookingTime;
    private Map<Long, Double> produstsMap;
    private Integer calories;
    private String description;

    public Dish(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
