package task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import task2.entity.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

    
}
