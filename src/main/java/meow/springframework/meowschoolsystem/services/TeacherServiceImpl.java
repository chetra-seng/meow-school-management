package meow.springframework.meowschoolsystem.services;

import meow.springframework.meowschoolsystem.model.Teacher;
import meow.springframework.meowschoolsystem.repositories.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{
    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return((List<Teacher>)teacherRepository.findAll());
    }

    @Override
    public Teacher getTeacherById(Long id) {
        if(teacherRepository.findById(id).isPresent()){
            return teacherRepository.findById(id).get();
        }

        return null;
    }
}
