package task2.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import task2.entity.Animal;
import task2.service.AnimalService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/animals")
public class AnimalController {
    private final AnimalService animalService;

    @GetMapping
    public ResponseEntity<List<Animal>> getAnimals() {
        List<Animal> animals = animalService.findAll();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Animal> getAnimal(@PathVariable("id") Long id) {
        Animal animal = animalService.findById(id);
        return new ResponseEntity<>(animal, HttpStatus.OK);
    }
}
