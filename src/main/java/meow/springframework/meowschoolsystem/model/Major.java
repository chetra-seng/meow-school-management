package meow.springframework.meowschoolsystem.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @Column(name = "maj_des", columnDefinition = "text")
    private String description;

    @ManyToOne
    @JoinColumn(name = "dep_no", referencedColumnName = "dep_no")
    private Department department;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "maj_no", referencedColumnName = "maj_no")
    private Set<Subject> subjects = new HashSet<>();

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "maj_no", referencedColumnName = "maj_no")
    private Set<MajorShiftTime> majorShiftTimes = new HashSet<>();

    @ManyToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinTable(
            name = "class_detail",
            joinColumns = @JoinColumn(name = "maj_no"),
            inverseJoinColumns = @JoinColumn(name = "cla_no")
    )
    private Set<Class> classes = new HashSet<>();

    @ManyToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            mappedBy = "majors"
    )
    private Set<Student> students = new HashSet<>();

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

    public Set<Student> getStudents() {
        return students;
    }

    public Department getDepartment() {
        return department;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public Set<MajorShiftTime> getMajorShiftTimes() {
        return majorShiftTimes;
    }

    public Set<Class> getClasses() {
        return classes;
    }
}
