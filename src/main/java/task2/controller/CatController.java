package task2.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import task2.entity.Cat;
import task2.service.CatService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/animals/cats")
public class CatController {
    private final CatService catService;

    @GetMapping
    public ResponseEntity<List<Cat>> getCats() {
        List<Cat> cats = catService.findAll();
        return new ResponseEntity<>(cats, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cat> getCat(@PathVariable("id") Long id) {
        Cat cat = catService.findById(id);
        return new ResponseEntity<>(cat, HttpStatus.OK);
    }
}
