package meow.springframework.meowschoolsystem.controllers;

import meow.springframework.meowschoolsystem.model.Department;
import meow.springframework.meowschoolsystem.services.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DepartmentAdminController {
    private final DepartmentService departmentService;

    public DepartmentAdminController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @RequestMapping("/admin/departments")
    public String listAllDepartments(Model model){
        model.addAttribute("departments", departmentService.getAllDepartments());
        return "admin/department_admin";
    }

    @RequestMapping("/admin/departments/new")
    public String addDepartmentForm(Model model){
        Department department = new Department();
        model.addAttribute("department", department);

        return "admin/new_department";
    }

    @PostMapping("/admin/departments")
    public String addDepartment(@ModelAttribute("department") Department department){
        departmentService.saveDepartment(department);

        return "redirect:/admin/departments";
    }

    @RequestMapping("/admin/departments/edit/{id}")
    public String updateDepartmentForm(@PathVariable Long id, Model model){
        model.addAttribute("department", departmentService.getDepartmentById(id));
        return "admin/update_department";
    }

    @PostMapping("/admin/departments/{id}")
    public String updateDepartment(@PathVariable Long id, @ModelAttribute("department") Department department){
        Department existDepartment = department;
        existDepartment.setId(id);
        existDepartment.setName(department.getName());
        existDepartment.setDescription(department.getDescription());
        existDepartment.setPath(department.getPath());
        departmentService.saveDepartment(existDepartment);

        return "redirect:/admin/departments";
    }

    @GetMapping("/admin/departments/{id}")
    public String deleteDepartment(@PathVariable Long id){
        departmentService.deleteDepartmentById(id);

        return "redirect:/admin/departments";
    }
}
