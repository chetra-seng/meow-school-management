package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "mark_type")
public class MarkType {
    @Id
    @Column(name = "type_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "max", nullable = false, columnDefinition = "int")
    private Integer max;

    @Column(name = "type", nullable = false, columnDefinition = "varchar(10)")
    private String type;

    @OneToMany(
            mappedBy = "markType",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    Set<Mark> marks = new HashSet<>();

    public MarkType() {
    }

    public MarkType(Integer max, String type) {
        this.max = max;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
