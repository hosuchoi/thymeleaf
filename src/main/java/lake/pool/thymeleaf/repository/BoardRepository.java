package lake.pool.thymeleaf.repository;

import lake.pool.thymeleaf.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
