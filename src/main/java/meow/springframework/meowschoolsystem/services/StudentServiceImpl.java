package meow.springframework.meowschoolsystem.services;

import meow.springframework.meowschoolsystem.model.Student;
import meow.springframework.meowschoolsystem.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
        if(studentRepository.findById(id).isPresent()){
            return studentRepository.findById(id).get();
        }

        return null;
    }
}
