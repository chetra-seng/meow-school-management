package meow.springframework.meowschoolsystem.model;

import org.hibernate.annotations.WhereJoinTable;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "class")
public class Class {
    @Id
    @Column(name = "cla_no", columnDefinition = "int")
    private Long id;

    @Column(name = "building", nullable = false)
    private Character building;

    @ManyToMany(mappedBy = "classes",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private Set<Major> majors = new HashSet<>();

    public Class() {
    }

    public Class(Character building) {
        this.building = building;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getBuilding() {
        return building;
    }

    public void setBuilding(Character building) {
        this.building = building;
    }

    public Set<Major> getMajors() {
        return majors;
    }
}
