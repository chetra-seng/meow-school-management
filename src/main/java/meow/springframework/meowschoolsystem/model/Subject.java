package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @Column(name = "sub_no", columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sub_name", nullable = false, columnDefinition = "varchar(30)")
    private String name;

    @Column(name = "sub_dur", nullable = false, columnDefinition = "int")
    private Integer duration;

    public Subject() {
    }

    public Subject(String name, Integer duration) {
        this.name = name;
        this.duration = duration;
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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
