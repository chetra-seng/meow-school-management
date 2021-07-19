package meow.springframework.meowschoolsystem.repositories;

import meow.springframework.meowschoolsystem.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
