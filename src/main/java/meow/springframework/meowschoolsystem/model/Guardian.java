package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "guardian")
public class Guardian {
    @Id
    @Column(name = "gua_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "gua_fname", nullable = false, columnDefinition = "varchar(30)")
    private String firstName;

    @Column(name = "gua_lname", nullable = false, columnDefinition = "varchar(30)")
    private String lastName;

    @Column(name = "gua_sex", columnDefinition = "varchar(6)")
    private String sex;

    @Column(name = "gua_phone", nullable = false, unique = true, columnDefinition = "char(10)")
    private String phone;

    @Column(name = "gua_add", columnDefinition = "varchar(100)")
    private String address;

    @OneToMany(
            mappedBy = "guardian",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private Set<Student> students = new HashSet<>();

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
