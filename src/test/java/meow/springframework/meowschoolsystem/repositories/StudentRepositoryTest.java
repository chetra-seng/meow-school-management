package meow.springframework.meowschoolsystem.repositories;

import meow.springframework.meowschoolsystem.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudentTest(){
        LocalDate localDate = LocalDate.parse("1999-11-05");
        Student student = new Student("Chetra", "Seng", "Male", localDate, "092823836", "Battambang", 2);
        studentRepository.save(student);
    }
}