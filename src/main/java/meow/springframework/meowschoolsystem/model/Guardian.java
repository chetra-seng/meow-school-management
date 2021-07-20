package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "guardian")
public class Guardian {
    @Id
    @Column(name = "gua_id")
    @SequenceGenerator(
            name = "guardian_sequence",
            sequenceName = "guardian_sequence",
            allocationSize = 1,
            initialValue = 1000001
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "guardian_sequence")
    private Long id;

    @Column(name = "gua_fname", nullable = false)
    private String firstName;

    @Column(name = "gua_lname", nullable = false)
    private String lastName;

    @Column(name = "gua_sex")
    private String sex;

    @Column(name = "gua_phone", nullable = false, unique = true)
    private String phone;

    @Column(name = "gua_add")
    private String address;

    public Guardian() {
    }

    public Guardian(String firstName, String lastName, String sex, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
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
