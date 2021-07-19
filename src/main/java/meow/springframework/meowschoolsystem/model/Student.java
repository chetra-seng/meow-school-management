package meow.springframework.meowschoolsystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1,
            initialValue = 1000001
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    @Column(name = "stu_id")
    private Long id;

    @Column(name = "stu_fname", nullable = false)
    private String firstName;

    @Column(name = "stu_lname", nullable = false)
    private String lastName;

    @Column(name = "stu_sex")
    private String sex;

    @Column(name = "stu_dob", nullable = false)
    private LocalDate birthDate;

    @Column(name = "stu_phone", nullable = false, unique = true)
    private String phone;

    @Column(name = "stu_add")
    private String address;

    @Column(name = "stu_year", nullable = false)
    private Integer year;

    public Student() {
    }

    public Student(String firstName, String lastName, String sex, LocalDate birthDate, String phone, String address, Integer year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.phone = phone;
        this.address = address;
        this.year = year;
    }

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
