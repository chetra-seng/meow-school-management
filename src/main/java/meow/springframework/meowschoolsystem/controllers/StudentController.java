package meow.springframework.meowschoolsystem.controllers;

import meow.springframework.meowschoolsystem.model.Major;
import meow.springframework.meowschoolsystem.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    private final StudentService studentService;
    private List<Major> majors = new ArrayList<>();

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/")
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students/home";
    }

    @RequestMapping("/student/{id}")
    public String displayStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "students/student";
    }
}
