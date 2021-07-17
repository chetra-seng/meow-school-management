package meow.springframework.meowschoolsystem.model;

import java.util.Set;
import java.util.TreeSet;

public class Subject {
    private Long id;
    private String name;
    private Integer duration;
    private Major major;
    private Set<Teacher> teachers = new TreeSet<Teacher>();
    private Set<Mark> marks = new TreeSet<Mark>();

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

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public Set<Mark> getMarks() {
        return marks;
    }
}
