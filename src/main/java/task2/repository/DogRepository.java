package task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import task2.entity.Dog;

public interface DogRepository extends JpaRepository<Dog, Long> {
}
