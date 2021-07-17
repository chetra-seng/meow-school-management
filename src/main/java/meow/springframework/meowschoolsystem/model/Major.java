package meow.springframework.meowschoolsystem.model;

import java.util.Set;
import java.util.TreeSet;

public class Major {
    private Long id;
    private String name;
    private Integer duration;
    private String description;
    private Department department;
    private Set<MajorShiftTime> shiftTime = new TreeSet<MajorShiftTime>();
    private Set<Subject> subjects = new TreeSet<Subject>();

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Set<MajorShiftTime> getShiftTime() {
        return shiftTime;
    }
}
