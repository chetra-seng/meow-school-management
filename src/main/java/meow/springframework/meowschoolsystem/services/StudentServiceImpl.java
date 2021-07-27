package meow.springframework.meowschoolsystem.services;

import meow.springframework.meowschoolsystem.model.Attendance;
import meow.springframework.meowschoolsystem.model.Guardian;
import meow.springframework.meowschoolsystem.model.Mark;
import meow.springframework.meowschoolsystem.model.Student;
import meow.springframework.meowschoolsystem.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return((List<Student>) studentRepository.findAll());
    }

    @Override
    public Student getStudentById(Long id) {
        return(studentRepository.findById(id).get());
    }
}
