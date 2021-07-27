package meow.springframework.meowschoolsystem.services;

import meow.springframework.meowschoolsystem.model.Attendance;
import meow.springframework.meowschoolsystem.model.Guardian;
import meow.springframework.meowschoolsystem.model.Mark;
import meow.springframework.meowschoolsystem.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
}
