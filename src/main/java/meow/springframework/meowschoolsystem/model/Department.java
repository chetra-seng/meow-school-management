package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "dep_no")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "dep_name", nullable = false)
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
