package meow.springframework.meowschoolsystem.services;

import meow.springframework.meowschoolsystem.model.Department;
import meow.springframework.meowschoolsystem.repositories.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<Department> getAllDepartments() {
        return((List<Department>)departmentRepository.findAll());
    }

    @Override
    public Department getDepartmentById(Long id) {
        if(departmentRepository.findById(id).isPresent()){
            return(departmentRepository.findById(id).get());
        }
        return null;
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void deleteDepartmentById(Long id) {
        departmentRepository.deleteById(id);
    }
}
