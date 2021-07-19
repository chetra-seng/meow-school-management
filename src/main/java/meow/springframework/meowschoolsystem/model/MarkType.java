package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "mark_type")
public class MarkType {
    @Id
    @Column(name = "type_no")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "max", nullable = false)
    private Integer max;

    @Column(name = "type", nullable = false)
    private String type;

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
