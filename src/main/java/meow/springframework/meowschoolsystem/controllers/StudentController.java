package meow.springframework.meowschoolsystem.controllers;

import meow.springframework.meowschoolsystem.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students/home";
    }

    @RequestMapping("/student/{id}")
    public String displayStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        model.addAttribute("attendances", studentService.getStudentById(id).getAttendances());
        model.addAttribute("marks", studentService.getStudentById(id).getMarks());
        model.addAttribute("majors", studentService.getStudentById(id).getMajors());
        model.addAttribute("guardian", studentService.getStudentGuardian(id));
        return "students/student";
    }
}
