package task2.service.impl;

import lombok.RequiredArgsConstructor;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;
import task2.entity.Cat;
import task2.entity.Dog;
import task2.repository.CatRepository;
import task2.repository.DogRepository;
import task2.service.DogService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DogServiceImpl implements DogService {
    private static final String THERE_IS_NO_DOG_WITH_S = "There is no dog with %s";
    private final DogRepository dogRepository;

    @Override
    public Dog findById(Long id) {
        return dogRepository.findById(id)
                .orElseThrow(() -> new ServiceException(String.format(THERE_IS_NO_DOG_WITH_S, id)));
    }

    @Override
    public List<Dog> findAll() {
        return dogRepository.findAll();
    }

}
