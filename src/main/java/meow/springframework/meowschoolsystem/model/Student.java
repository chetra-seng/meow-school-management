package meow.springframework.meowschoolsystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stu_id")
    private Long id;

    @Column(name = "stu_fname", nullable = false, columnDefinition = "varchar(30)")
    private String firstName;

    @Column(name = "stu_lname", nullable = false, columnDefinition = "varchar(30)")
    private String lastName;

    @Column(name = "stu_sex", columnDefinition = "varchar(6)")
    private String sex;

    @Column(name = "stu_dob", nullable = false)
    private LocalDate birthDate;

    @Column(name = "stu_phone", nullable = false, unique = true, columnDefinition = "char(10)")
    private String phone;

    @Column(name = "stu_add", columnDefinition = "varchar(100)")
    private String address;

    @Column(name = "stu_year", nullable = false, columnDefinition = "int")
    private Integer year;

    @ManyToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JoinTable(
            name = "major_detail",
            joinColumns = @JoinColumn(name = "stu_id"),
            inverseJoinColumns = @JoinColumn(name = "maj_no")
    )
    private Set<Major> majors = new HashSet<>();

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "stu_id", referencedColumnName = "stu_id")
    private Set<Mark> marks = new HashSet<>();

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "stu_id", referencedColumnName = "stu_id")
    private Set<Attendance> attendances = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "gua_id", referencedColumnName = "gua_id")
    private Guardian guardian;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Set<Major> getMajors() {
        return majors;
    }

    public Set<Mark> getMarks() {
        return marks;
    }

    public Set<Attendance> getAttendances() {
        return attendances;
    }
}
