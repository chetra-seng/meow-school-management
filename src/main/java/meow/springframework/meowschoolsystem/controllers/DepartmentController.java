package meow.springframework.meowschoolsystem.controllers;

import meow.springframework.meowschoolsystem.services.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @RequestMapping("/")
    public String listAllDepartments(Model model){
        model.addAttribute("departments", departmentService.getAllDepartments());
        return "index";
    }
}
