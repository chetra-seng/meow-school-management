package meow.springframework.meowschoolsystem.controllers;

import meow.springframework.meowschoolsystem.services.StudentService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students/all_students";
    }
}
