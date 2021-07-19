package meow.springframework.meowschoolsystem.repositories;

import meow.springframework.meowschoolsystem.model.Major;
import org.springframework.data.repository.CrudRepository;

public interface MajorShiftTimeRepository extends CrudRepository<Major, Long> {
}
