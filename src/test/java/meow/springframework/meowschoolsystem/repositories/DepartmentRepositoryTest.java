package meow.springframework.meowschoolsystem.repositories;

import meow.springframework.meowschoolsystem.model.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentRepositoryTest {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    public void saveDepartment(){
        Department department = new Department("Test");
        departmentRepository.save(department);
    }

    @Test
    public void viewDepartment(){
        ArrayList<Department> departments = new ArrayList<Department>();
        departments = (ArrayList<Department>)departmentRepository.findAll();
        for(Department department : departments){
            System.out.println("Department name: " + department.getName());
        }
    }
}