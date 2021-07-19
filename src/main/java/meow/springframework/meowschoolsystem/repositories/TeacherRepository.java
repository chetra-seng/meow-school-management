package meow.springframework.meowschoolsystem.repositories;

import meow.springframework.meowschoolsystem.model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
}
