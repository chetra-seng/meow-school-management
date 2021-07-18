package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "Guardian")
public class Guardian {
    @Id
    @Column(name = "guaID")
    @SequenceGenerator(
            name = "guardian_sequence",
            sequenceName = "guardian_sequence",
            allocationSize = 1,
            initialValue = 1000001
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "guardian_sequence")
    private Long id;

    @Column(name = "guaFName", nullable = false)
    private String firstName;

    @Column(name = "guaLName", nullable = false)
    private String lastName;

    @Column(name = "guaSex")
    private String sex;

    @Column(name = "guaPhone", nullable = false, unique = true)
    private String phone;

    @Column(name = "guaAdd")
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
