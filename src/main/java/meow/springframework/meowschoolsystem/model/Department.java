package meow.springframework.meowschoolsystem.model;

import java.util.Set;
import java.util.TreeSet;

public class Department {
    private Long id;
    private String name;
    private Set<Major> majors = new TreeSet<Major>();

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

    public Set<Major> getMajors() {
        return majors;
    }
}
