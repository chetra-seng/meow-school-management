package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "major_shifttime")
public class MajorShiftTime {
    @Id
    @Column(name = "shifttime_no", columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "time", nullable = false, columnDefinition = "varchar(30)")
    private String time;

    public MajorShiftTime() {
    }

    public MajorShiftTime(String time) {
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
