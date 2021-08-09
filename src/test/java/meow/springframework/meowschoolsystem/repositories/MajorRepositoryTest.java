package meow.springframework.meowschoolsystem.repositories;

import meow.springframework.meowschoolsystem.model.Major;
import meow.springframework.meowschoolsystem.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SpringBootTest
public class MajorRepositoryTest {
    @Autowired
    private MajorRepository majorRepository;

    @Test
    public void viewMajorTest(){
        ArrayList<Major> majors = new ArrayList<Major>();
        majors = (ArrayList<Major>) majorRepository.findAll();
        for(Major major : majors){
            System.out.println(major.getName());
        }
    }

    @Test
    void viewRegisteredStudentTest(){
        ArrayList<Major> majors = new ArrayList<Major>();
        majors = (ArrayList<Major>) majorRepository.findAll();
        for(Major major : majors){
            Set<Student> students = major.getStudents();
            Iterator<Student> studentIterator = students.iterator();
            System.out.println("Major: " + major.getName());
            while(studentIterator.hasNext()){
                Student student = studentIterator.next();
                System.out.println("  " + student.getFirstName() + " " + student.getLastName());
            }
        }
    }
}
