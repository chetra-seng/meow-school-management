package meow.springframework.meowschoolsystem.repositories;

import meow.springframework.meowschoolsystem.model.Guardian;
import org.springframework.data.repository.CrudRepository;

public interface GuardianRepository extends CrudRepository<Guardian, Long> {
}
