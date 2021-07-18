package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Mark")
public class Mark {
    @Id
    @Column(name = "marNo")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "marTotal", nullable = false)
    private Integer mark;

    @Column(name = "marDate", nullable = false)
    private LocalDate date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
