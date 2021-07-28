package meow.springframework.meowschoolsystem.services;

import meow.springframework.meowschoolsystem.model.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(Long id);
}
