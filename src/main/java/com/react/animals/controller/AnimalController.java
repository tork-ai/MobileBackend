package com.react.animals.controller;

import com.react.animals.entity.Animal;
import com.react.animals.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/call")
    public String hello() {
        return "Hello Yera. Its our mobile backend. Eskereeeeeeee!";
    }

    @GetMapping("/animals")
    public List<Animal> getAnimals() {
        return animalService.getAnimals();
    }

    @GetMapping("/animal/{id}")
    public Optional<Animal> getAnimal(@PathVariable("id") Long id) {
        return animalService.getAnimal(id);
    }
}
