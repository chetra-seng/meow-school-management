package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "Major")
public class Major {
    @Id
    @Column(name = "majNo")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "majName", nullable = false)
    private String name;

    @Column(name = "majDur", nullable = false)
    private Integer duration;

    @Column(name = "majDes")
    private String description;

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
