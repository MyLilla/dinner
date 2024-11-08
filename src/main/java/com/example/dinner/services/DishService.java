package com.example.dinner.services;

import com.example.dinner.models.Dish;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DishService {

    @Getter
    @Setter
    private List<Dish> dishes = new ArrayList<>();

    private long ID = 0;

    public DishService() {
        dishes.add(new Dish(++ID, "Salat"));
        dishes.add(new Dish(++ID, "Supe"));
        dishes.add(new Dish(++ID, "Kasha"));
    }

    public Dish getById(Long id) {
//       return dishes.stream().filter(dish -> dish.getId() == id).findFirst().orElseGet(null);
        for (Dish dish : dishes) {
            if (dish.getId().equals(id));
        }
        return null;
    }

    public void saveDish(Dish dish) {
        dish.setId(++ID);
        dishes.add(dish);
    }

    public void deleteDish(Long id){
        dishes.removeIf(dish -> dish.getId().equals(id));
    }
}
