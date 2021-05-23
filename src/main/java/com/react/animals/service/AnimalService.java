package com.react.animals.service;

import com.react.animals.entity.Animal;
import com.react.animals.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    
    @Autowired
    private AnimalRepository animalRepository;
    
    public List<Animal> getAnimals() {
        return animalRepository.findAll();
    }

    public Optional<Animal> getAnimal(Long id) {
        return animalRepository.findById(id);
    }
}
