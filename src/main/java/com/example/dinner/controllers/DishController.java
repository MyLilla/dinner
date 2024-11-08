package com.example.dinner.controllers;

import com.example.dinner.models.Dish;
import com.example.dinner.services.DishService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class DishController {

    private final DishService dishService;
    @GetMapping("/")
    public String dishes(Model model) {

        model.addAttribute("dishes", dishService.getDishes());
        return "dishes";
    }

    @GetMapping("/dish/{id}")
    public String getById(@PathVariable long id, Model model) {
        model.addAttribute("dish", dishService.getById(id));
        return "dish";
    }

    @PostMapping("/dish/create")
    public String createDish(Dish dish){
        dishService.saveDish(dish);
        return "redirect:/";
    }

    @PostMapping("/dish/delete/{id}")
    public String deleteDish(@PathVariable long id){
        dishService.deleteDish(id);
        return "redirect:/";
    }
}
