package task2.service;

import task2.entity.Cat;

import java.util.List;

public interface CatService {
    Cat findById(Long id);

    List<Cat> findAll();

}
