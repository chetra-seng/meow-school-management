package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "Class")
public class Class {
    @Id
    @Column(name = "claNo")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "building", nullable = false)
    private Character building;

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
}
