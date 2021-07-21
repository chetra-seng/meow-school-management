package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "major")
public class Major {
    @Id
    @Column(name = "maj_no", columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "maj_name", nullable = false, columnDefinition = "varchar(30)")
    private String name;

    @Column(name = "maj_dur", nullable = false, columnDefinition = "int")
    private Integer duration;

    @Column(name = "maj_des", columnDefinition = "varchar(100)")
    private String description;

    public Major() {
    }

    public Major(String name, Integer duration, String description) {
        this.name = name;
        this.duration = duration;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
