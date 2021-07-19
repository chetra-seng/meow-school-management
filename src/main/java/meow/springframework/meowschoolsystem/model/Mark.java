package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "mark")
public class Mark {
    @Id
    @Column(name = "mar_no")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "mar_total", nullable = false)
    private Integer mark;

    @Column(name = "mar_date", nullable = false)
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
