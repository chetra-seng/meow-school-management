package meow.springframework.meowschoolsystem.repositories;

import meow.springframework.meowschoolsystem.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
    @Test
    public void viewStudentTest(){
        ArrayList<Student> students = new ArrayList<Student>();
        students = (ArrayList<Student>) studentRepository.findAll();
        for(Student student : students){
            System.out.print(student.getFirstName() + " ");
            System.out.print(student.getLastName() + " ");
            System.out.print(student.getSex() + " ");
            System.out.print(student.getBirthDate() + " ");
            System.out.print(student.getPhone() + " ");
            System.out.print(student.getAddress() + " ");
            try{
                System.out.println(student.getGuardian().getFirstName() + " " + student.getGuardian().getLastName());
            }
            catch (Exception ex){
                System.out.println("");
            }
        }
    }
}