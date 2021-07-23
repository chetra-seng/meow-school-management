package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @Column(name = "tea_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="tea_fname", nullable = false, columnDefinition = "varchar(30)")
    private String firstName;

    @Column(name="tea_lname", nullable = false, columnDefinition = "varchar(30)")
    private String lastName;

    @Column(name="tea_sex", columnDefinition = "varchar(6)")
    private String sex;

    @Column(name="tea_dob", nullable = false)
    private LocalDate birthDate;

    @Column(name = "tea_phone", nullable = false, unique = true, columnDefinition = "char(10)")
    private String phone;

    @Column(name = "tea_add", columnDefinition = "varchar(100)")
    private String address;

    @ManyToOne
    @JoinColumn(name = "sub_no", referencedColumnName = "sub_no")
    private Subject subject;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String sex, LocalDate birthDate, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.phone = phone;
        this.address = address;
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

    public Subject getSubject() {
        return subject;
    }
}
