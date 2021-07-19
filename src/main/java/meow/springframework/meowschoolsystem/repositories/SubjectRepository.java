package meow.springframework.meowschoolsystem.repositories;

import meow.springframework.meowschoolsystem.model.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, Long> {
}
