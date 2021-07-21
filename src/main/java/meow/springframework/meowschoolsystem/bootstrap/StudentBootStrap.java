package meow.springframework.meowschoolsystem.bootstrap;

import meow.springframework.meowschoolsystem.model.Student;
import meow.springframework.meowschoolsystem.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

public class StudentBootStrap implements CommandLineRunner {
    private final StudentRepository studentRepository;

    public StudentBootStrap(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        LocalDate date1 = LocalDate.parse("1999-05-11");
        Student student1 = new Student("Chetra", "Seng", "Male", date1, "092823836", "Battambang", 2);
        studentRepository.save(student1);
        System.out.println("Added student 1");

        LocalDate date2 = LocalDate.parse("2001-05-27");
        Student student2 = new Student("Sreykin", "Seng", "Female", date2, "012680698", "Battambang", 2);
        studentRepository.save(student2);
        System.out.println("Added student 2");
    }
}
