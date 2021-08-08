package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "dep_no", columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dep_name", nullable = false, columnDefinition = "varchar(30)")
    private String name;

    @Column(name = "dep_des", columnDefinition = "text")
    private String description;

    @Column(name = "dep_path", columnDefinition = "varchar(100)")
    private String path;

    @OneToMany(
            mappedBy = "department",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private Set<Major> majors = new HashSet<>();

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

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

    public Set<Major> getMajors() {
        return majors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
