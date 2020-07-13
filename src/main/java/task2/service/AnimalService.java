package task2.service;

import task2.entity.Animal;

import java.util.List;

public interface AnimalService {
    Animal findById(Long id);

    List<Animal> findAll();
}
