package meow.springframework.meowschoolsystem.model;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private String sex;
    private LocalDate birthDate;
    private String phone;
    private String address;
    private Integer year;
    private Guardian guardian;
    private Set<Mark> marks = new TreeSet<Mark>();
    private Set<Attendance> attendances = new TreeSet<Attendance>();

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

    public Guardian getGuardian() {
        return guardian;
    }

    public void setGuardian(Guardian guardian) {
        this.guardian = guardian;
    }
}
