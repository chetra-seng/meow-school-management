package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Teacher")
public class Teacher {
    @Id
    @Column(name = "teaId")
    @SequenceGenerator(
            name="teacher_sequence",
            sequenceName = "teacher_sequence",
            allocationSize = 1,
            initialValue = 1000001
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_sequence")
    private Long id;

    @Column(name="teaFName", nullable = false)
    private String firstName;

    @Column(name="teaLName", nullable = false)
    private String lastName;

    @Column(name="teaSex")
    private String sex;

    @Column(name="teaDOB", nullable = false)
    private LocalDate birthDate;

    @Column(name = "teaPhone", nullable = false, unique = true)
    private String phone;

    @Column(name = "teaAdd")
    private String address;

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

}
