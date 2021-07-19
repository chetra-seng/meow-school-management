package meow.springframework.meowschoolsystem.repositories;

import meow.springframework.meowschoolsystem.model.Mark;
import org.springframework.data.repository.CrudRepository;

public interface MarkRepository extends CrudRepository<Mark, Long> {
}
