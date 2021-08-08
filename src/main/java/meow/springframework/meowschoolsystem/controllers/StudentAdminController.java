package meow.springframework.meowschoolsystem.controllers;

import meow.springframework.meowschoolsystem.model.Major;
import meow.springframework.meowschoolsystem.model.Student;
import meow.springframework.meowschoolsystem.services.MajorService;
import meow.springframework.meowschoolsystem.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Set;

@Controller
public class StudentAdminController {
    private final StudentService studentService;
    private final MajorService majorService;

    public StudentAdminController(StudentService studentService, MajorService majorService) {
        this.studentService = studentService;
        this.majorService = majorService;
    }

    @GetMapping("/admin/students")
    public String listStudentsAdmin(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "admin/student_admin";
    }

    @GetMapping("admin/students/new")
    public String addStudent(Model model){
        Student student = new Student();
        Major major = new Major();
        Set<Major> majors = student.getMajors();
        majors.add(major);
        model.addAttribute("student", student);
        model.addAttribute("studentMajor", major);
        model.addAttribute("majors", majorService.getAllMajors());
        return "admin/new_student";
    }
}
