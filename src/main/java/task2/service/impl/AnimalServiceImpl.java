package task2.service.impl;

import lombok.RequiredArgsConstructor;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;
import task2.entity.Animal;
import task2.repository.AnimalRepository;
import task2.service.AnimalService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AnimalServiceImpl implements AnimalService {
    private static final String THERE_IS_NO_ANIMAL_WITH_ID_S = "There is no animal with id %s";
    private final AnimalRepository animalRepository;

    @Override
    public Animal findById(Long id) {
        return animalRepository.findById(id)
                .orElseThrow(() -> new ServiceException(THERE_IS_NO_ANIMAL_WITH_ID_S + id));
    }

    @Override
    public List<Animal> findAll() {
        return animalRepository.findAll();
    }
}
