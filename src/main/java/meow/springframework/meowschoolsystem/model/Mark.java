package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "mark")
public class Mark {
    @Id
    @Column(name = "mar_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mar_total", nullable = false, columnDefinition = "int")
    private Integer mark;

    @Column(name = "mar_date", nullable = false)
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "sub_no", referencedColumnName = "sub_no")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "type_no", referencedColumnName = "type_no")
    private MarkType markType;

    public Mark() {
    }

    public Mark(Integer mark, LocalDate date) {
        this.mark = mark;
        this.date = date;
    }

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

    public Subject getSubject() {
        return subject;
    }

    public MarkType getMarkType() {
        return markType;
    }
}
