package meow.springframework.meowschoolsystem.repositories;

import meow.springframework.meowschoolsystem.model.Attendance;
import org.springframework.data.repository.CrudRepository;

public interface AttendanceRepository extends CrudRepository<Attendance, Long> {
}
