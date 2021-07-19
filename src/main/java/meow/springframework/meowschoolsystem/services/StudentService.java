package meow.springframework.meowschoolsystem.services;

import meow.springframework.meowschoolsystem.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();
    public Student getStudentById(Long id);
}
