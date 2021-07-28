package meow.springframework.meowschoolsystem.controllers;

import meow.springframework.meowschoolsystem.services.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @RequestMapping("/teachers")
    public String listAllTeacher(Model model){
        model.addAttribute("teachers", teacherService.getAllTeachers());
        return "teachers/all_teachers";
    }
}
