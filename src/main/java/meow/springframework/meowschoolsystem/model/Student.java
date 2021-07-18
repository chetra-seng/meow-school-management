package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1,
            initialValue = 1000001
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    @Column(name = "stuID")
    private Long id;

    @Column(name = "stuFName", nullable = false)
    private String firstName;

    @Column(name = "stuLName", nullable = false)
    private String lastName;

    @Column(name = "stuSex")
    private String sex;

    @Column(name = "stuDOB", nullable = false)
    private LocalDate birthDate;

    @Column(name = "stuPhone", nullable = false, unique = true)
    private String phone;

    @Column(name = "stuAdd")
    private String address;

    @Column(name = "stuYear", nullable = false)
    private Integer year;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
