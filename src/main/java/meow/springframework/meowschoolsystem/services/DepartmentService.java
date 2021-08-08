package meow.springframework.meowschoolsystem.services;

import meow.springframework.meowschoolsystem.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(Long id);
    Department saveDepartment(Department department);
    void deleteDepartmentById(Long id);
}
