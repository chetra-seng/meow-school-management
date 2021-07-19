package meow.springframework.meowschoolsystem.repositories;

import meow.springframework.meowschoolsystem.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
