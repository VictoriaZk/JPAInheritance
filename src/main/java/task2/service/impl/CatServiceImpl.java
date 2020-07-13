package task2.service.impl;

import lombok.RequiredArgsConstructor;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;
import task2.entity.Cat;
import task2.repository.CatRepository;
import task2.service.CatService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CatServiceImpl implements CatService {
    private static final String THERE_IS_NO_CAT_WITH_S = "There is no cat with %s";
    private final CatRepository catRepository;

    @Override
    public Cat findById(Long id) {
        return catRepository.findById(id)
                .orElseThrow(() -> new ServiceException(String.format(THERE_IS_NO_CAT_WITH_S, id)));
    }

    @Override
    public List<Cat> findAll() {
        return catRepository.findAll();
    }
}
