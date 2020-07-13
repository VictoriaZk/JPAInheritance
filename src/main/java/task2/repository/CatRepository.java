package task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import task2.entity.Cat;

public interface CatRepository extends JpaRepository<Cat, Long> {
}
