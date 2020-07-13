package task2.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import task2.entity.Dog;
import task2.service.DogService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/animals/dogs")
public class DogController {
    private final DogService dogService;

    @GetMapping
    public ResponseEntity<List<Dog>> getDogs() {
        List<Dog> dogs = dogService.findAll();
        return new ResponseEntity<>(dogs, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Dog> getDog(@PathVariable("id") Long id) {
        Dog dog = dogService.findById(id);
        return new ResponseEntity<>(dog, HttpStatus.OK);
    }
}
