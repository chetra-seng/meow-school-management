package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "Department")
public class Department {
    @Id
    @Column(name = "depNo")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "depName", nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
