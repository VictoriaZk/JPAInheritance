package task2.service;

import task2.entity.Dog;

import java.util.List;

public interface DogService {
    Dog findById(Long id);

    List<Dog> findAll();
}
