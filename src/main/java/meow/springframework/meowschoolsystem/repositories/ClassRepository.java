package meow.springframework.meowschoolsystem.repositories;

import meow.springframework.meowschoolsystem.model.Class;
import org.springframework.data.repository.CrudRepository;

public interface ClassRepository extends CrudRepository<Class, Long> {
}
